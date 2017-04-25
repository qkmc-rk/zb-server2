var pageSize=5;  //每页显示的记录条数
var curPage=0;   //显示第curPage页
var len;         //总行数
var page;        //总页数

$(function(){    
	len =$("#show_tab tr").length-1;   //去掉表头     
	page=len % pageSize==0 ? len/pageSize : Math.floor(len/pageSize)+1;//根据记录条数，计算页数
	//console.log(len+"   "+page);
	curPage=1;
	$("#currentPages").html(curPage + "/" + page);
	displayPage();//显示第一页
	$("#nextpage").click(function(){
	    if(curPage<page){
	        curPage+=1;
	        $("#currentPages").html(curPage + "/" + page);
	    }
	    else{
	        //不跳
	    }
	    displayPage();
    });
	$("#lastpage").click(function(){
	    if(curPage>1){
	        curPage-=1;
	        $("#currentPages").html(curPage + "/" + page);
	    }
	    else{
	    	//不跳
	    }
	    displayPage();
	    });
   });
function displayPage(){  
	var begin=(curPage-1)*pageSize;//起始记录号
	var end = begin + pageSize;
	if(end > len ) end=len;
	$("#show_tab tr").hide();
	$("#show_tab tr").each(function(i){
	   if(i-1>=begin && i-1<end)//显示第page页的记录
	   {
	      $("#show_tab_one").show();
	      $(this).show();
	   }         
	});
}
	
function submitMsg(){
	var msg = document.getElementById("userMsg").value;		//获取输入框中的值
	var usersname = document.getElementById("usersname").innerText;	//获取当前用户
	
	$.ajax({
		type:"get",
		url:"saveMsg.do",
		data:{"mseg":msg,"username":usersname},
		async:false,
		success:function(data){
			location.reload();
		}
	});
	
}