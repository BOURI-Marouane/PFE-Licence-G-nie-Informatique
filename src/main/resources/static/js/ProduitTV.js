$(document).ready(function() {

			$('.nBtn , .table .eBtn').on('click', function(event) {
	 	
				event.preventDefault();
				var href = $(this).attr('href');
				var text = $(this).text();
				if(text=='Modifier') {
				$.get(href, function(p, status) {
					$('.myForm #idProduitTV').val(p.idProduitTV);
					$('.myForm #designation').val(p.designation);
					$('.myForm #prix').val(p.prix);
					$('.myForm #quantite').val(p.quantite);
					$('.myForm #pecture').val(p.image);
				}); 
				$('.myForm #exampleModal').modal();
				} else 
					{
					$('.myForm #idProduitTV').val('');
					$('.myForm #designation').val('');
					$('.myForm #prix').val('');
					$('.myForm #quantite').val('');
					$('.myForm #pecture').val('');
					$('.myForm #exampleModal').modal();
					}
			});

		});

function AfficherCacher(text)
{
          	$('.btn-primary').on('click', function(event)
          			{
          		      document.getElementById(text).style.display = "line";
          			});
}