/**
 * 
 */




function email_change(){
	
/*
if(document.join.email.options[document.join.email.selectedIndex].value == '0'){

 document.join.email2.disabled = true;

 document.join.email2.value = " ";
 dovument.join.email2.text = "";
}
*/

	
	
}
	function pwErrorCheck(){
	    var pw = document.join.wUserPW.value;
	    //var confirmPW = document.join.wUserPWConfirm.value;
	    if (pw.length < 6 || pw.length > 16) {
	        window.alert('비밀번호는 6글자 이상, 16글자 이하만 이용 가능합니다.');
	        document.join.pw.value =""
	        document.join.pwCheck.value="";
	        document.join.pw.focus();
	    }    
	}


	function isSame(){    
		var pw = document.join.pw.value;
	    var confirmPW = document.join.confirmPW.value;
		if(pw !="" && confirmPW!="") {
	        if(pw == confirmPW) {
	        	  document.getElementById('check').innerHTML='비밀번호가 일치합니다.'
	              document.getElementById('check').style.color='blue';
	        }
	        else {
	        	document.getElementById('check').innerHTML='비밀번호가 일치하지 않습니다.';
	            document.getElementById('check').style.color='red';
	        }
	    }	
	}
	



function SetEmailTail(emailValue) {	  
	  if ( emailValue == "notSelected" ){
		  document.join.email2.readOnly = true;
		  document.join.email2.value = "";   
	  }	   
	  else if ( emailValue == "etc" ) {
		  document.join.email2.readOnly = false;
		  document.join.email2.value = "";   
	  } else {
		  document.join.email2.readOnly = true;
		  document.join.email2.value = emailValue;
	  }
}


function Btn(index){
	
	if(index ==1){		
		document.join.method="post"	
		document.join.action="../../test/test1.jsp";
		
	}
	else if(index==2)
		{	
		document.join.method="post"
			document.join.action="/WebTest/Servlet";	
		}
	else if(index ==3)
		{document.join.method="post"
		document.join.action="../../test/test3.jsp";
		}
	document.join.submit();
}



//본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
function sample4_execDaumPostcode() {
    new daum.Postcode({
        oncomplete: function(data) {
            // 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

            // 도로명 주소의 노출 규칙에 따라 주소를 표시한다.
            // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
            var roadAddr = data.roadAddress; // 도로명 주소 변수
            var extraRoadAddr = ''; // 참고 항목 변수

            // 법정동명이 있을 경우 추가한다. (법정리는 제외)
            // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
            if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                extraRoadAddr += data.bname;
            }
            // 건물명이 있고, 공동주택일 경우 추가한다.
            if(data.buildingName !== '' && data.apartment === 'Y'){
               extraRoadAddr += (extraRoadAddr !== '' ? ', ' + data.buildingName : data.buildingName);
            }
            // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
            if(extraRoadAddr !== ''){
                extraRoadAddr = ' (' + extraRoadAddr + ')';
            }

            // 우편번호와 주소 정보를 해당 필드에 넣는다.
            document.getElementById('sample4_postcode').value = data.zonecode;
            document.getElementById("sample4_roadAddress").value = roadAddr;
            document.getElementById("sample4_jibunAddress").value = data.jibunAddress;
            
            // 참고항목 문자열이 있을 경우 해당 필드에 넣는다.
            if(roadAddr !== ''){
                document.getElementById("sample4_extraAddress").value = extraRoadAddr;
            } else {
                document.getElementById("sample4_extraAddress").value = '';
            }

            var guideTextBox = document.getElementById("guide");
            // 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
            if(data.autoRoadAddress) {
                var expRoadAddr = data.autoRoadAddress + extraRoadAddr;
                guideTextBox.innerHTML = '(예상 도로명 주소 : ' + expRoadAddr + ')';
                guideTextBox.style.display = 'block';

            } else if(data.autoJibunAddress) {
                var expJibunAddr = data.autoJibunAddress;
                guideTextBox.innerHTML = '(예상 지번 주소 : ' + expJibunAddr + ')';
                guideTextBox.style.display = 'block';
            } else {
                guideTextBox.innerHTML = '';
                guideTextBox.style.display = 'none';
            }
        }
    }).open();
}

