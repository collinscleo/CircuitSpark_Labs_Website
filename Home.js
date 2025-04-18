document.querySelector('.cta-btn').addEventListener('click', () => {
    window.location.href = '#kits';
});

// Adding some subtle scroll animations
window.addEventListener('scroll', () => {
    const scrollY = window.scrollY;

    const kits = document.querySelectorAll('.kit-card');
    kits.forEach(kit => {
        if (scrollY + window.innerHeight > kit.offsetTop + 50) {
            kit.classList.add('animate');
        }
    });
});

function search() {
    // Declare variables
    var input, filter, ul, li, a, i, txtValue;
    input = document.getElementById('myInput');
    filter = input.value.toUpperCase();
    ul = document.getElementById("myUL");
    li = ul.getElementsByTagName('li');

    // Check if the input is empty
    if (filter === "") {
        // Hide all list items if the input is empty
        for (i = 0; i < li.length; i++) {
            li[i].style.display = "none";
        }
    } else {
        // Loop through all list items, and hide those who don't match the search query
        for (i = 0; i < li.length; i++) {
            a = li[i].getElementsByTagName("a")[0];
            txtValue = a.textContent || a.innerText;
            if (txtValue.toUpperCase().indexOf(filter) > -1) {
                li[i].style.display = "";
            } else {
                li[i].style.display = "none";
            }
        }
    }
}
