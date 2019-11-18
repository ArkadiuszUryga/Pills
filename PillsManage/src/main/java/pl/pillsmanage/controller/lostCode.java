package pl.pillsmanage.controller;

public class lostCode {
	//from new_dosage.jsp
	
	<div class="form-group">
	<label for="medicaments" class="col-md-6 control-label">Wybierz
		lek. <small class="text-muted">Jeżeli leku nie ma na
			liście, kliknij <a href="addMedicament">TUTAJ</a>
	</small>
	</label>
	<div class="form-group">
		<form:select path="medicaments" class="form-control">
			<c:forEach items="${listOfMedicaments}" var="listOfMedicaments">
				<option value="${listOfMedicaments}">${listOfMedicaments.nazwa}</option>

			</c:forEach>
		</form:select>
		
	</div>
	

	<div class="row">
		<div class="col-sm">
			<label for="ilosc_rano" class="col-md-3 control-label">Dawka leku rano:</label>
		
			<form:radiobuttons path="ilosc_rano" items="${numberList}" />
		</div>
		<div class="col-sm">
<label for="ilosc_poludnie" class="col-md-3 control-label">Dawka leku południe:</label>
<form:radiobuttons path="ilosc_poludnie" items="${numberList}" />
</div>
		<div class="col-sm">
<label for="ilosc_wieczor" class="col-md-3 control-label">Dawka leku wieczór:</label>
<form:radiobuttons path="ilosc_wieczor" items="${numberList}" />
</div>
	</div>
</div>

/////////////////////////////////////////
//from dosage.java (entity)
//////////////////////////////////////////

//@ManyToOne
//private Medicaments medicaments;
//
//private int ilosc_rano;
//private int ilosc_poludnie;
//private int ilosc_wieczor;
}
