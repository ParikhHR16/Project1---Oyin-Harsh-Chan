/**
 * 
 */


window.onload = function(){
	getEmployeeInfo();
}

function getEmployeeInfo(){
	
	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		if(xhttp.readyState == 4 && xhttp.status == 200){
			let convertE = JSON.parse(xhttp.responseText);
			setValues(convertE);
		}
	}

/*function getEmployeeInfo(){
	
	let xhttp = new XMLHttpRequest();
	xhttp.onreadystatechange = function(){
		if(xhttp.readyState == 4 && xhttp.status == 200){
			let convertE = JSON.parse(xhttp.responseText);
			setValues(convertE);
		}

	}
	
	xhttp.open("GET", 'http://localhost:9000/Project1//html/AdminHome.do', true);
	xhttp.send();
}*/
	
	xhttp.open("GET", 'http://localhost:9000/Project1/html/AdminHome.do', true);
	xhttp.send();
}
function setValues(convertE){

	//document.getElementById("employeeid").innerHTML = "emp username is " +convertE.firstname;
	//document.getElementById("employeeid").innerHTML = "emp username is " +convertE;
/*	document.getElementById("employeeFirstName").innerHTML = employee.firstname;
	document.getElementById("employeeLastName").innerHTML = employee.lastname;
	document.getElementById("expenseType").innerHTML =employee.type_e_t;
	document.getElementById("exspenseAmount").innerHTML =  employee.amount_e_t;
	document.getElementById("exspenseDateSub").innerHTML = employee.sub_date_e_t;
	document.getElementById("exspenseDateReso").innerHTML = employee.res_date_e_t;
	document.getElementById("exspenseStatus").innerHTML = employee.status_e_t;
	document.getElementById("exspenseTicketId").innerHTML = employee.id_e_t;*/
	
	
			var myTableDiv = document.getElementById("reimbtable")
            var table = document.createElement('TABLE')
            var tableBody = document.createElement('TBODY')

             table.border = '1'
            table.appendChild(tableBody);

			var heading = new Array();
            heading[0] = "User Id"
            heading[1] = "First Name"
            heading[2] = "Last Name"
            heading[3] = "Type"
			heading[4] = "Amount"
			heading[5] = "Date submitted"
            heading[6] = "Date resolved"
            heading[7] = "Status"
            heading[8] = "Description"
			heading[9] = "Ticket Id"
			
			    //TABLE COLUMNS
			    var tr = document.createElement('TR');
			    tableBody.appendChild(tr);
			    for (i = 0; i < heading.length; i++) {
			        var th = document.createElement('TH')
			        th.width = '75';
			        th.appendChild(document.createTextNode(heading[i]));
			        tr.appendChild(th);
			    }
			    var empid=convertE[0].id_emp;
			    var empfirstname = convertE[0].firstname;
				var emplastname= convertE[0].lastname;
				var expT= convertE[0].exp_type;
				var expAmount= convertE[0].exp_amount;
				var expDateSub=convertE[0].exp_Date_s;
				var expDateRe=convertE[0].exp_Date_r;
				var expStatus=convertE[0].exp_s;
				var expDes=convertE[0].exp_description;
				var expTicket =convertE[0].exp_T_id;
				
			    var empid1=convertE[1].id_emp;
			    var empfirstname1 = convertE[1].firstname;
				var emplastname1= convertE[1].lastname;
				var expT1= convertE[1].exp_type;
				var expAmount1= convertE[1].exp_amount;
				var expDateSub1=convertE[1].exp_Date_s;
				var expDateRe1=convertE[1].exp_Date_r;
				var expStatus1=convertE[1].exp_s;
				var expDe1=convertE[1].exp_description;
				var expTicket1 =convertE[1].exp_T_id;
				
			    
			    //TABLE ROWS
			var stock = new Array();
			stock[0] = new Array(empid,empfirstname,emplastname,expT,expAmount,expDateSub,expDateRe,expStatus,expDes,expTicket);
            stock[1] = new Array(empid1,empfirstname1,emplastname1,expT1,expAmount1,expDateSub1,expDateRe1,expStatus1,expDe1,expTicket1);


/*		convertE.forEach(function(item, index, array) {
			
		
		    //TABE ROWS
		    for (i = 0; i < convertE.length; i++) {
		        var tr = document.createElement('TR');
		        for (j = 0; j < convertE[i].length; j++) {
		            var td = document.createElement('TD')
		            td.appendChild(document.createTextNode(convertE[i][j]));
		            tr.appendChild(td)
		        }
		        tableBody.appendChild(tr);
		    }  
		    myTableDiv.appendChild(table)
			
				document.write(item.id_emp);
				document.write(item.firstname);
				document.write(item.lastname);
				document.write(item.exp_type);
				document.write(item.exp_amount);
				document.write(item.exp_Date_s);
				document.write(item.exp_Date_r);
				document.write(item.exp_s);
				document.write(item.exp_description);
				document.write(item.exp_T_id);
			  });*/
            
		    //TABE ROWS
		    for (i = 0; i < stock.length; i++) {
		        var tr = document.createElement('TR');
		        for (j = 0; j < stock[i].length; j++) {
		            var td = document.createElement('TD')
		            td.appendChild(document.createTextNode(stock[i][j]));
		            tr.appendChild(td)
		        }
		        tableBody.appendChild(tr);
		    }  
		    myTableDiv.appendChild(table)


}