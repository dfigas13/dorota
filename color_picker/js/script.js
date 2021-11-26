// Hintergrundfarbe mit radio buttons
const light = document.querySelector('#white');
light.addEventListener('click', function() {
	container.style.backgroundColor = 'white';
});

const grey = document.querySelector('#grey');
grey.addEventListener('click', () => {
	container.style.backgroundColor = 'grey';
});

const dark = document.querySelector('#dark');
dark.addEventListener('click', function() {
	container.style.backgroundColor = 'black';
});

const container = document.querySelector('#container');

const m_link = document.querySelector('.m_link');
m_link.addEventListener('click', addDiv);
const tf_input = document.querySelector('#tf_input');

myCount = 1;
//neues div und Inputfeldär, am Ende click event ruft diese Funktion noch einmal, die Funktion kann nur 3 mal gerufen sein 
function addDiv() {
	if(myCount < 3) {
		myCount++;
		var mydiv = document.createElement('div');
		mydiv.classList.add('swatch');
		mydiv.setAttribute('id', 'picker-2' + myCount);
		mydiv.addEventListener('change', changeColor);
		container.appendChild(mydiv);
		m_link.removeEventListener('click', addDiv);

		var lab = document.createElement('label');
		lab.setAttribute('for', 'red-2' + myCount);
		lab.innerHTML = ' Red: ';
		tf_input.appendChild(lab);
		
		var inp_one = document.createElement('input');
		inp_one.setAttribute('type', 'number');
		inp_one.setAttribute('value', '0');
		inp_one.setAttribute('min', '0');
		inp_one.setAttribute('max', '255');
		inp_one.setAttribute('id', 'red-2' + myCount);
		inp_one.setAttribute('name', 'r-2' + myCount);
		inp_one.addEventListener('change', changeColor);
		tf_input.appendChild(inp_one);

		var lab2 = document.createElement('label');
		lab2.setAttribute('for', 'green-2' + myCount);
		lab2.innerHTML = ' Green: ';
		tf_input.appendChild(lab2);

		var inp_two = document.createElement('input');
		inp_two.setAttribute('type', 'number');
		inp_two.setAttribute('value', '0');
		inp_two.setAttribute('max', '255');
		inp_two.setAttribute('max', '255');
		inp_two.setAttribute('id', 'green-2' + myCount );
		inp_two.setAttribute('name', 'g-2' + myCount);
		inp_two.addEventListener('change', changeColor);
		tf_input.appendChild(inp_two);

		var lab3 = document.createElement('label');
		lab3.setAttribute('for', 'blue-2' + myCount);
		lab3.innerHTML = ' Blue: ';
		tf_input.appendChild(lab3)

		var inp_last = document.createElement('input');
		inp_last.setAttribute('type', 'number');
		inp_last.setAttribute('value', '0');
		inp_last.setAttribute('max', '255');
		inp_last.setAttribute('max', '255');
		inp_last.setAttribute('id', 'blue-2' + myCount);
		inp_last.setAttribute('name', 'b-2' + myCount);
		inp_last.addEventListener('change', changeColor);
		tf_input.appendChild(inp_last);

		if(myCount < 3) {
			let a = document.createElement('a');
			a.setAttribute('href', '#');
			a.innerHTML = '  Add next swatch'; 
			a.setAttribute('title', 'next swatch');
			tf_input.appendChild(a);
			a.addEventListener('click', addDiv);
		}
	}
}

// swatch ändert die Farbe
const swatch = document.querySelector('.swatch');
swatch.addEventListener('change', changeColor);

const redcol = document.querySelector('#red-1');
const greencol = document.querySelector('#green-1');
const bluecol = document.querySelector('#blue-1');

let inputs = document.querySelectorAll('input[type=number]'); 

inputs.forEach(input => {
	input.addEventListener('change', changeColor);
});

/* function changeColor(e) {
	console.log(e.target.id);
	let myColors = 'rgb(' + redcol.value + ',' + greencol.value + ',' + bluecol.value + ')';
	swatch.style.backgroundColor = myColors;
}  */

function changeColor(e) {
	var id = e.target.id.split('-')[1];
	document.querySelector('#picker-' + id).style.backgroundColor = 'rgb('+ document.querySelector('#red-' + id).value + ',' + document.querySelector('#green-' + id).value + ',' + document.querySelector('#blue-' + id).value + ')';
} 

// BR()
/*function createLabel(channel, content) {
	var nlab = document.createElement('label');
	nlab.setAttribute('for', channel + '-' + num);
	nlab.innerHTML = content + ': ';
	tf_input.appendChild(nlab);
	return nlab;
}

function createField(channel, content) {
	var inp_one = document.createElement('input');
	inp_one.setAttribute('type', 'number');
	inp_one.setAttribute('value', '0');
	inp_one.setAttribute('min', '0');
	inp_one.setAttribute('max', '255');
	inp_one.setAttribute('id', 'red');
	tf_input.appendChild(inp_one);
	inp_one.addEventListener('change', changeColor)
	return inp_one;
}*/



