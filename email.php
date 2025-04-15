<?php
// Database connection
$servername = "localhost";
$username = "Admin";
$password = "Admin";
$dbname = "email_system";

$conn = new mysqli($servername, $username, $password, $dbname);

// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Check if form is submitted
if ($_SERVER["REQUEST_METHOD"] == "POST") {
    $email = $_POST['email'];
    $password = $_POST['password'];
    $recipient = $_POST['recipient'];
    $subject = $_POST['subject'];
    $message = $_POST['message'];

    // Save credentials and message to the database
    $stmt = $conn->prepare("INSERT INTO emails (email, password, recipient, subject, message) VALUES (?, ?, ?, ?, ?)");
    $stmt->bind_param("sssss", $email, $password, $recipient, $subject, $message);

    if ($stmt->execute()) {
        echo "Message saved successfully.";
    } else {
        echo "Error: " . $stmt->error;
    }

    $stmt->close();
    // Send email
    $headers = "From: " . $email;
    if (mail($recipient, $subject, $message, $headers)) {
        echo "Email sent successfully.";
    } else {
        echo "Failed to send email.";
    }
}