<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <title>Data Table</title>
    <link rel="stylesheet" href="resources/css/style.css">
    <script src="resources/js/jquery-3.0.0.min.js"></script>
    <style type="text/css">
        .table-fill{
            max-width: 100%;
            height: auto;
        }
    </style>
    <script type="text/javascript">
        jQuery(function(){

            var formatTh = function(desMenu,estMenu){
                return '<tr class="dinamic"><td class="text-left" id="des-menu">'+desMenu+'</td><td class="text-left" id="est-menu">'+estMenu+'</td></tr>';
            }

            jQuery.ajax({
                url: "/backend/api/menu/all",
                method: "GET",
                dataType: "json"
            }).done(function(json){
                jQuery(".dinamic").remove();
                jQuery.each(json,function(i,data){
                    jQuery.each(jQuery.parseJSON(data.dataSource),function(y,menus){
                        jQuery(".table-fill")
                                .append(formatTh(menus.description,menus.active));
                    });
                });
            });
        });
    </script>
</head>

<body>

<html lang="en">
<head>
    <meta charset="utf-8" />
    <title>Table Style</title>
    <meta name="viewport" content="initial-scale=1.0; maximum-scale=1.0; width=device-width;">
</head>

<body>
<div class="table-title">
    <h3 style="text-align: center">Información de los Menús</h3>
</div>
<table class="table-fill">
    <thead>
    <tr>
        <th class="text-left">Descripción del Menu</th>
        <th class="text-left">Estado</th>
    </tr>
    </thead>
    <tbody class="table-hover">
    <tr class="dinamic">
        <td class="text-left" id="des-menu"></td>
        <td class="text-left" id="est-menu"></td>
    </tr>
    </tbody>
</table>


</body>


</html>
