<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
   <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
    
    <link rel="stylesheet" type="text/css" href="<%=path%>/easyUI/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/easyUI/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/easyUI/css/demos.css">
    
    <script type="text/javascript" src="<%=path%>/js/jquery-1.8.3.js"></script>
    <script type="text/javascript" src="<%=path%>/js/jquery-ui.js"></script>
    <script type="text/javascript" src="<%=path%>/js/jquery.easyui.min.js"></script>
    
    <script type="text/javascript">
    	$(function(){
    		$("#gridSearch").button().click(function(){
    			searchTitle();
    		});
    	
    		function searchTitle(){
    			var titleValue=$("#keywords").val();
    			$("#dg").datagrid("load",{title:titleValue});
    		}
    		
    		$("#dg").datagrid({
    			url:'listHouse.action',
    			rownumbers:true,
    			iconCls:'icon-search',
    			pagination:true,//显示地步分页栏
    			pageSize:4,
    			pageList:[4,8,12],
    			fitColumns:true,//自适应宽度,防止水平滚动
    			striped:true,//隔行变色
    			columns:[[
    				{field:'id',title:'编号',width:80},
    				{field:'title',title:'标题',width:80},
    				{field:'description',title:'描述',width:80},
    				{field:'price',title:'价格',width:80},
    				{field:'floorage',title:'面积',width:80},
    				{field:'contact',title:'联系电话',width:80},
    				{field:'opr',title:'操作',width:40,formatter:function(){
    					return "<a href='#' style='color:red'>删除</a>";
    				}}
    			]],
    			
    			onClickCell:function(index,field,v){
    				if(field=="opr"){
    					$.messager.confirm('确认','您确认要删除记录吗?',function(r){
    						if(r){
    							var hid=$("#dg").datagrid("getRows")[index].id;
    							$.getJSON("deleteHouse.action",{id:hid},function(obj){
    									$("#dg").datagrid("reload");
    							});
    						}
    					});
    				}
    			},
    			loadMsg:"数据加载中....."
    		});
    	});
    </script>
  </head>
  
  <body>   
	  <div class="easyui-layout" style="width:100%;height:100%;">
		    <div data-options="region:'north',title:'North Title',split:true" style="height:100px;">North</div>   
		    <div data-options="region:'south',title:'South Title',split:true" style="height:100px;">South</div>   
		    <div data-options="region:'east',iconCls:'icon-reload',title:'East',split:true" style="width:100px;">East</div>   
		    <div data-options="region:'west',title:'West',split:true" style="width:100px;">West</div>   
		    <div data-options="region:'center',title:'center title'" style="padding:5px;background:#eee;">
		    	<div class="search" style="text-align:right;">
		    		按标题
		    		<input id="keywords" class="autoComplete" type="text" name="keywords" size="40"/>
		    		<input id="gridSearch" class="gridSearch" type="button" name="search" value="搜索"/>
		       	</div>
		    	<table id="dg" title="房屋出租信息"></table>
		    </div>   
	  </div>
	  <div id="dd">
	  </div>
  
   
  </body>
</html>
