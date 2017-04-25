<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta charset="UTF-8">
		<title>tempraruture</title>
		
		<script src="${pageContext.request.contextPath }js/jquery-2.1.0.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath }js/echarts.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="${pageContext.request.contextPath }js/echarts-liquidfill.js" type="text/javascript" charset="utf-8"></script>
		<style type="text/css">
			html,body{
				background-color: #204D74;
				height: 99%;
				width: 99%;
			}
		</style>
	</head>
	<body>
		<!--div for display temprature-->
		<div id="temp" style="height: 96%; width: 96%; border: dashed #1B6D85 1px; margin: auto;">

		</div>	

	
<!--   </body>    -->
		<!--script-->
		<script type="text/javascript">
			var myChart = echarts.init(document.getElementById("temp"));
			var series = [];

			var data = [-28, -6, -3, 12, 22, 31, 40,44];
			var time = [1,2,3,4,5,6,7,8];
			
			var titles = [];
			
			for (var i = 0; i < 8; i++) {
			
			    var x = 8 + i / 8 * 100 + '%';
			
			    titles.push({
			        text: time[i],
			        textAlign: 'center',
			        left: x,
			        bottom: 10,
			        padding: 0,
			        textStyle: {
			            color: '#fff',
			            fontSize: 12,
			            fontWeight: 'normal'
			        }
			    })
			
			    series.push({
			        animation: true,
			        waveAnimation: true,
			
			        color: ['rgb(253, 77, 73)'],
			        center: [x, '50%'],
			        radius: '63%',
			        type: 'liquidFill',
			        shape: 'path://M229.844,151.547v-166.75c0-11.92-9.662-21.582-21.58-21.582s-21.581,9.662-21.581,21.582v166.75c-9.088,6.654-14.993,17.397-14.993,29.524c0,20.2,16.374,36.575,36.574,36.575c20.199,0,36.574-16.375,36.574-36.575C244.838,168.944,238.932,158.201,229.844,151.547z',
			        outline: {
			            show: false
			        },
			        amplitude: 1,
			        waveLength: '20%',
			        backgroundStyle: {
			            color: 'none',
			            borderColor: '#fff',
			            borderWidth: 5
			        },
			        data: [{
			            // -60°C to 100°C 
			            value: (data[i] - (-60)) / 160 + 0.1,
			            rawValue: data[i]
			        }],
			        itemStyle: {
			            normal: {
			                shadowBlur: 0
			            }
			        },
			        label: {
			            normal: {
			                position: 'insideBottom',
			                distance: 10,
			                formatter: function(item) {
			                    return ' ' + item.data.rawValue + '°';
			                },
			                textStyle: {
			                    color: 'rgb(253, 77, 73)',
			                    fontSize: 16
			                }
			            }
			        }
			    })
			}
			
			myChart.setOption({
			    title: titles,
			    series: series
			});
		</script>
	</body>
</html>