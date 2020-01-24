<html>
<head>
<meta charset="UTF-8">
<title>Demande Service</title>
</head>
<body>
	<center>
    <p> Demande Service </p>
    <p> Welcome ${id}!! </p>
	<form action= "demande/addDemande" method="post" οnsubmit="return checkAll()">
        nom de service : <input type="text" name="nomService" /><br>
        type de service: <input type="text" name="typeService" /><br>
        nature de service : <input type="text" name="natureService" /><br>
        data valid Demande: <input id="date" type="Date" name="dateValidDemande" οnblur="checkDate()"/><br>
        description : <input type="text" name="description" /><br>
        description detail: <input type="text" name="descriptionDetail" /><br>
        localisation de service :<input type="text" name="localisationService" /><br>
        etat du service : <input type="text" name="etatService" /><br>
        <input type="submit" value = "Submit demande"/><br>
    </form>
    </center>
    <script type="text/javascript">
    function checkId(){  
    	    var id = document.getElementById("idDemande").value;  
    	    if(checknumber(id)) 
        	{ 
            alert("enter number please！"); 
            return false; 
        	} 
        	return true; 

    }  
    function checkDate() {
    	var strInputDate = document.getElementById("date").value;
        // 定义一个月份天数常量数组
        var DA = [0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31];

        // 统一日期格式
        strDate = strInputDate.replace(/-/g, "/");

        //判断日期是否是预期的格式
        if (strDate.indexOf("/") == -1) {
            alert("请输入 yyyy-M-d、yyyy-MM-dd、yyyy/M/d、yyyy/MM/dd 格式。") return false;
        }

        // 分解出年月日
        arrD = strDate.split("/");
        if (arrD.length != 3) return false;
        y = parseInt(arrD[0], 10);
        m = parseInt(arrD[1], 10);
        d = parseInt(arrD[2], 10);

        //判断年月日是否是数字
        if (isNaN(y) || isNaN(m) || isNaN(d)) return false;

        // 判断月份是否在1-12之间
        if (m > 12 || m < 1) return false;
        //判断是否是闰年
        if (isLoopYear(y)) DA[2] = 29;

        //判断输入的日是否超过了当月月份的总天数。
        if (d > DA[m]) return false;

        //各种条件都验证了，则应该是一个合法的日期了。
        // 如果要对日期进行一次格式化，则可以在这里进行处理了，下面格式化成数据库识别的日期格式 yyyy-MM-dd
        // str = y + "-" + (m<10?"0":"") + m + "-" + (d<10?"0":"") + d;
        str = y + "-" + (m < 10 ? "0": "") + m + "-" + (d < 10 ? "0": "") + d;
        alert(str) return true;
    }
    function isLoopYear(theYear) {
        return (new Date(theYear, 1, 29).getDate() == 29);
    }
    function checkAll(){  
    	        var id= checkId();  
    	        var date = checkDate();  
    	        ;  
    	        if(idl&&date){  
    	            return true;  
    	        }else{  
    	            return false;  
    	        }  

    } 
    	
    	
    </script>
</body>
</html>