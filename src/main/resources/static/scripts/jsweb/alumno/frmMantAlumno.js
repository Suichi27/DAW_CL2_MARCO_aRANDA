$(document).on("click","#btnagregar",function(){
$("#txtidalumno").val("A000");
$("#txtapealumno").val("");
$("#txtnomalumno").val("");
$("#txtproce").val("");
$.ajax({
        type: "GET",
        url: "/Especialidad/listarEspecialidad",
        dataType: "json",
        success: function(resultado){
            $.each(resultado, function(index, value){
                $("#cboesp").append(
                    `<option value="${value.idesp}">${value.nomesp}</option>`
                )
            })
        }
    })
$("#modalNuevo").modal("show");

})

$(document).on("click","#btnactualizar",function(){
//alert("HolaBoton Agregar");
$("#txtidalumno").val($(this).attr("data-idalumno"));
$("#txtapealumno").val($(this).attr("data-apealumno"));
$("#txtnomalumno").val($(this).attr("data-nomalumno"));
$("#hddidalumno").val($(this).attr("data-idalumno"))
$("#txtproce").val($(this).attr("data-proce"));
var idesp = $(this).attr("data-idesp")
$.ajax({
        type: "GET",
        url: "/Especialidad/listarEspecialidad",
        dataType: "json",
        success: function(resultado){
            $.each(resultado, function(index, value){
                $("#cboesp").append(
                    `<option value="${value.idesp}">${value.nomesp}</option>`
                )
            })
            $("cboesp").val(idesp)
        }
    })
$("#modalNuevo").modal("show");
})


