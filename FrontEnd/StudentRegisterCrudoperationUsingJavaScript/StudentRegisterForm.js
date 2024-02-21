var selectedRow = null;
function onFormSubmit(){

    event.preventDefault();
    var FormData = readFormData();
    if(selectedRow === null)
    {
     insertNewStudent(FormData);   
    }
    else{

    }
}

function readFormData(){

var FormData={};

FormData["name"]= document.getElementById("name").value;
FormData["lastname"]= document.getElementById("lastname").value;
FormData["emailid"]= document.getElementById("emailid").value;
FormData["number"]= document.getElementById("number").value;
FormData["address"]= document.getElementById("address").value;

return FormData;
}

function insertNewStudent(data){

var table = document.getElementById("studentlist").getElementsByTagName('tbody')[0];
var newRow = table.insertRow(table.length);

var cell1=newRow.insertCell(0);
    cell1.innerHTML = data.name;
var cell2=newRow.insertCell(1);
    cell2.innerHTML = data.lastname;
var cell3=newRow.insertCell(2);
    cell3.innerHTML = data.emailid;
var cell4=newRow.insertCell(3);
    cell4.innerHTML = data.number;
var cell5=newRow.insertCell(4);
    cell5.innerHTML = data.address;
var cell6=newRow.insertCell(5);
    cell6.innerHTML = '<button>Edit</button> <button>Delete</button>'

}