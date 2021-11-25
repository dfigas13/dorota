//all buttons with numbers
const number_buttons = document.querySelectorAll('.calc-button');
//operators
const operation_button = document.querySelectorAll('.operation-button');
const equqls_button = document.querySelector('#equals');
//result on the screen
let end_result = document.querySelector('#calculator-output');
//currently result
let actual_result = '';
//undeclared operation
let operation = undefined;

//method eval() takes tehe point before the line
const calculateResult = () => {
	let my_action;
	
	// if actual_action not a number is
	/* if(isNaN(actual_action)) {
		// escape from function
		return;
	} */
	if(operation == '+' || operation == '-' || operation == '*' || operation == '/') {
		my_action = eval(actual_result);
		actual_result = my_action;
	}
}

const chooseOperation = (operator) => {
	if(actual_result === '') {
		return;
	}
	operation = operator;
	actual_result = actual_result.toString() + operator.toString();
}

const updateResult = () => {
	end_result.innerText = actual_result;
}

const addNumber = (num) => {
	// console.log(e.target.id = 'add-to');
	// if(num === '.' ) {
		/* if(actual_result = '.' && num.includes('.')) {
			return;
		} */
	// num = '.';
	// }
	actual_result = actual_result.toString() + num.toString(); 
}

//delete function with esc button + updateResult
const deleteResult = (e) => {
	if(e.keyCode == 27) {
		actual_result = actual_result.toString().slice(0,-1); 
		updateResult();
	}
}
window.addEventListener('keydown', deleteResult);

//all number buttons in the loop
number_buttons.forEach((num) => {
	num.addEventListener('click', () => {
	addNumber(num.innerText);
	updateResult();
	});
});

//all operators in the loop
operation_button.forEach((operator) => {
	operator.addEventListener('click', () => {
		// if(operator == 1) {
			chooseOperation(operator.innerText);
			updateResult();
		// }
		
	})
});

equqls_button.addEventListener('click', () => {
	calculateResult();
	updateResult();
});


// https://www.youtube.com/watch?v=U5uKj7KpKV8  
	/* for(item of number_buttons) {
		item.addEventListener('click', (ev) => {
			var clicked_buttton = ev.target.value;
			result.innerHTML = clicked_buttton;
		});
	} */	


