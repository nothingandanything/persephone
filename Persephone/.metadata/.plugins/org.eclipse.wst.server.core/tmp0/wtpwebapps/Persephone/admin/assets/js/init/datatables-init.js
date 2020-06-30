(function ($) {
    //    "use strict";


    /*  Data Table
    -------------*/




    $('#usertable').DataTable({
        lengthMenu: [[5, 10, 20, -1], [5, 10, 20, "All"]],
        ordering: true, //排序功能
        columns: [{
        	title: "用户名id",
        	data: "userid"
        	}, {
        	title: "用户名",
        	data:"username"
        	}, {
        	title: "密码",
        	data:"userpwd"
        	}, {
        	title: "联系方式",
        	data:"userphone"
        	}, {
        	title: "操作"
        	}]
        
    });
    
    $('#admintable').DataTable({
        lengthMenu: [[5, 10, 20, -1], [5, 10, 20, "All"]],
        ordering: true, //排序功能
        
        
    });



    $('#bootstrap-data-table-export').DataTable({
        dom: 'lBfrtip',
        lengthMenu: [[10, 25, 50, -1], [10, 25, 50, "All"]],
        buttons: [
            'copy', 'csv', 'excel', 'pdf', 'print'
        ]
    });
	
	$('#row-select').DataTable( {
			initComplete: function () {
				this.api().columns().every( function () {
					var column = this;
					var select = $('<select class="form-control"><option value=""></option></select>')
						.appendTo( $(column.footer()).empty() )
						.on( 'change', function () {
							var val = $.fn.dataTable.util.escapeRegex(
								$(this).val()
							);
	 
							column
								.search( val ? '^'+val+'$' : '', true, false )
								.draw();
						} );
	 
					column.data().unique().sort().each( function ( d, j ) {
						select.append( '<option value="'+d+'">'+d+'</option>' )
					} );
				} );
			}
		} );

	$("#updateuser").on('show.bs.modal', function (event) {
        var btnThis = $(event.relatedTarget); //触发事件的按钮
        var modal = $(this); //当前模态框
        var modalid = btnThis.data('id'); //解析出data-id的内容
        var modalname = btnThis.data('name'); //解析出data-name的内容
        var modalpwd = btnThis.data('pwd'); //解析出data-pwd的内容
        var modalpho = btnThis.data('pho'); //解析出data-pho的内容
        
        // 将从"按钮"解析出来的data值赋给"模态框"的input标签中对于的value里面
        $('#update-id').attr('value', modalid);
        $('#update-name').attr('value', modalname);
        $('#update-pwd').attr('value', modalpwd);
        $('#update-pho').attr('value', modalpho);
    });




})(jQuery);