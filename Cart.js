document.querySelectorAll('.add-to-cart').forEach(button => {
    button.addEventListener('click', function() {
        const productElement = this.parentElement;
        const productId = '1'; // You can set a unique ID for each product
        const productName = productElement.querySelector('h1').textContent.trim(); // Get the product name
        
        const cartItem = document.createElement('li');
        cartItem.innerHTML = `${productName} <button class="remove-from-cart">Remove</button>`;
        cartItem.setAttribute('data-productid', productId);
        
        document.getElementById('cart').appendChild(cartItem);
    });
});

document.getElementById('cart').addEventListener('click', function(e) {
    if (e.target.classList.contains('remove-from-cart')) {
        e.target.parentElement.remove();
    }
});