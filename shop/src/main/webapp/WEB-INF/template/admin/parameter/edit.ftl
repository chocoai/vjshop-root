[#escape x as x?html]
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<title>${message("admin.parameter.edit")} - Powered By VJSHOP</title>
<meta name="author" content="VJSHOP Team" />
<meta name="copyright" content="VJSHOP" />
<link href="${base}/resources/admin/css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="${base}/resources/admin/js/jquery.js"></script>
<script type="text/javascript" src="${base}/resources/admin/js/jquery.validate.js"></script>
<script type="text/javascript" src="${base}/resources/admin/js/common.js"></script>
<script type="text/javascript" src="${base}/resources/admin/js/input.js"></script>
<script type="text/javascript">
$().ready(function() {

	var $inputForm = $("#inputForm");
	var $addNameButton = $("#addNameButton");
	var $nameTable = $("#nameTable");
	
	[@flash_message /]
	
	// 增加参数名称
	$addNameButton.click(function() {
		$nameTable.append(
			[@compress single_line = true]
				'<tr>
					<td>
						<input type="text" name="nameList" class="text" maxlength="200" \/>
					<\/td>
					<td>
						<a href="javascript:;" class="remove">[${message("admin.common.remove")}]<\/a>
					<\/td>
				<\/tr>'
			[/@compress]
		);
	});
	
	// 删除参数名称
	$nameTable.on("click", "a.remove", function() {
		if ($nameTable.find("tr").size() <= 2) {
			$.message("warn", "${message("admin.common.deleteAllNotAllowed")}");
			return false;
		}
		$(this).closest("tr").remove();
	});
	
	// 表单验证
	$inputForm.validate({
		rules: {
            parameterGroup: "required",
			orders: "digits",
            nameList: "required"
		}
	});

});
</script>
</head>
<body>
	<div class="breadcrumb">
		<a href="${base}/admin/common/index.jhtml">${message("admin.breadcrumb.home")}</a> &raquo; ${message("admin.parameter.edit")}
	</div>
	<form id="inputForm" action="update.jhtml" method="post">
		<input type="hidden" name="id" value="${parameter.id}" />
		<table class="input">
			<tr>
				<th>
					${message("Parameter.productCategory")}:
				</th>
				<td>
					${parameter.productCategoryVO.name}
				</td>
			</tr>
			<tr>
				<th>
					<span class="requiredField">*</span>${message("Parameter.group")}:
				</th>
				<td>
					<input type="text" name="parameterGroup" class="text" value="${parameter.parameterGroup}" maxlength="200" />
				</td>
			</tr>
			<tr>
				<th>
					${message("admin.common.order")}:
				</th>
				<td>
					<input type="text" name="orders" class="text" value="${parameter.orders}" maxlength="9" />
				</td>
			</tr>
			<tr>
				<th>
					&nbsp;
				</th>
				<td>
					<a href="javascript:;" id="addNameButton" class="button">${message("admin.parameter.addName")}</a>
				</td>
			</tr>
			<tr>
				<th>
					&nbsp;
				</th>
				<td>
					<table id="nameTable" class="item">
						<tr>
							<th>
								${message("Parameter.names")}
							</th>
							<th>
								${message("admin.common.action")}
							</th>
						</tr>
						[#list parameter.nameList as name]
							<tr>
								<td>
									<input type="text" name="nameList" class="text" value="${name}" maxlength="200" />
								</td>
								<td>
									<a href="javascript:;" class="remove">[${message("admin.common.remove")}]</a>
								</td>
							</tr>
						[/#list]
					</table>
				</td>
			</tr>
			<tr>
				<th>
					&nbsp;
				</th>
				<td>
					<input type="submit" class="button" value="${message("admin.common.submit")}" />
					<input type="button" class="button" value="${message("admin.common.back")}" onclick="history.back(); return false;" />
				</td>
			</tr>
		</table>
	</form>
</body>
</html>
[/#escape]