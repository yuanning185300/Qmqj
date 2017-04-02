function insert() {
		var tdList = $("#insert").children("td");
		var data = {
			name : tdList.eq(0).find("input").val(),
			nameReplace:tdList.eq(22).find("input").val(),
			attack : tdList.eq(1).find("input").val(),
			defense : tdList.eq(2).find("input").val(),
			life : tdList.eq(3).find("input").val(),
			lifePerc : tdList.eq(4).find("input").val(),
			damagePerc : tdList.eq(5).find("input").val(),
			elementPerc : tdList.eq(6).find("input").val(),
			excellentPerc : tdList.eq(7).find("input").val(),
			excellentProb : tdList.eq(8).find("input").val(),
			doubProb : tdList.eq(9).find("input").val(),
			rebound : tdList.eq(10).find("input").val(),
			additional : tdList.eq(11).find("input").val(),
			resist : tdList.eq(12).find("input").val(),
			attackRecovery : tdList.eq(13).find("input").val(),
			attackRecoveryPerc : tdList.eq(14).find("input").val(),
			resistDouble : tdList.eq(15).find("input").val(),
			resistExcellent : tdList.eq(16).find("input").val(),
			resistLucky : tdList.eq(17).find("input").val(),
			medicineRecovery : tdList.eq(18).find("input").val(),
			holyRecovery : tdList.eq(19).find("input").val(),
			lifeRecovery : tdList.eq(20).find("input").val(),
			elementReduce : tdList.eq(21).find("input").val(),
		}
		
		$.ajax({
			type : "POST",
			url : "/Qmqj/qmqj/insert",
			data : data,
			success : function() {
				window.location.reload()
			}
		});
}

