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