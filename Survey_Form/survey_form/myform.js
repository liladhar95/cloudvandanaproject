
        const form = document.getElementById('survey-form');
        const popup = document.getElementById('popup');
        const resultElement = document.getElementById('result');
        const resetBtn = document.getElementById('reset-btn');
        const closePopupBtn = document.getElementById('close-popup');

        form.addEventListener('submit', function (e) {
            e.preventDefault();
            const firstName = document.getElementById('first-name').value;
            const lastName = document.getElementById('last-name').value;
            const dob = document.getElementById('dob').value;
            const country = document.getElementById('country').value;
            const gender = [];
            if (document.getElementById('male').checked) {
                gender.push('Male');
            }
            if (document.getElementById('female').checked) {
                gender.push('Female');
            }
            const profession = document.getElementById('profession').value;
            const email = document.getElementById('email').value;
            const mobile = document.getElementById('mobile').value;


            const resultText = `First Name: ${firstName}<br>Last Name: ${lastName}<br>Date of Birth: ${dob}<br>Country: ${country}<br>Gender: ${gender.join(', ')}<br>Profession: ${profession}<br>Email: ${email}<br>Mobile Number: ${mobile}`;

            resultElement.innerHTML = resultText;
            popup.style.display = 'block';
        });

        resetBtn.addEventListener('click', function () {
            form.reset();
        });

        closePopupBtn.addEventListener('click', function () {
            popup.style.display = 'none';
            form.reset();
        });
    
