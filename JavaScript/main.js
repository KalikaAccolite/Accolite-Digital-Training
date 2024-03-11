let students = [
    {
        firstName: 'Kalika',
        lastName: 'Awasthi',
        age: 20,
        gender: 'female',
        rollNo: '101',
        dob: '2000-01-01',
        hobbies: ['reading', 'gaming'],
        mobileDevice: 'iOS'
    },
    {
        firstName: 'Utkarsh',
        lastName: 'Bajpai',
        age: 22,
        gender: 'male',
        rollNo: '102',
        dob: '1998-05-15',
        hobbies: ['traveling', 'painting'],
        mobileDevice: 'Android'
    }
];
function validateForm() {
    let form = document.getElementById('registrationForm');
    if (form.checkValidity()) {
        let formData = new FormData(form);
        let hobbies = formData.get('hobbies').split(',').map(item => item.trim());
        let student = {
            firstName: formData.get('firstName'),
            lastName: formData.get('lastName'),
            age: formData.get('age'),
            gender: formData.get('gender'),
            rollNo: formData.get('rollNo'),
            dob: formData.get('dob'),
            hobbies: hobbies,
            mobileDevice: formData.get('mobileDevice')
        };
        alert('Form submitted:', student);
        return true;
    } else {
        alert('Form validation failed.');
        return false;
    }
}
function getStudentDetails() {
    let rollNo = document.getElementById('getRollNo').value;
    let student = students.find(s => s.rollNo === rollNo);
    if (student) {
        console.log('Student details:', student);
    } else {
        console.log('Student not found.');
    }
}