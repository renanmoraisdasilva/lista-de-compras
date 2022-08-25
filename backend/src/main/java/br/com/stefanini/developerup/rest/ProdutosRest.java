package br.com.stefanini.developerup.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.transaction.Transactional;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;

import br.com.stefanini.developerup.dto.ProdutoDto;
import br.com.stefanini.developerup.service.ProdutoService;


@RequestScoped
@Path("/produto")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProdutosRest {

    @Inject
    ProdutoService service;

    @GET
    @Operation(summary = "Listar", description = "Retorna uma lista dos produtos da lista de compras")
    @APIResponse(
        responseCode = "200",
        description = "ProdutoDto",
        content = {@Content(
            mediaType = "application/json", 
            schema = @Schema(implementation = ProdutoDto.class)
        )})
    public Response listar()  {
        return Response.status(Response.Status.OK).entity(service.listar()).build();
    }

    @POST
    @Operation(summary = "Salvar", description = "Salva um produto na lista de compras")
    @Transactional

    @APIResponse(
        responseCode = "200",
        description = "ProdutoDto",
        content = {@Content(
            mediaType = "application/json", 
            schema = @Schema(implementation = ProdutoDto.class)
        )})
    public Response salvar(ProdutoDto request)  {
        return Response.status(Response.Status.OK).entity(service.salvar(request)).build();
    }


    @PUT
    @Operation(summary = "Update", description = "Atualiza um produto na lista de compras")
    @Path("{id}")
    @Transactional
    @APIResponse(
        responseCode = "200",
        description = "ProdutoDto",
        content = {@Content(
            mediaType = "application/json", 
            schema = @Schema(implementation = ProdutoDto.class)
        )})
	public Response update(ProdutoDto request){
        return Response.status(Response.Status.OK).entity(service.update(request)).build();
		 
	}


    @DELETE  
    @Operation(summary = "Deletar", description = "Deleta um produto na lista de compras")
    @Path("{id}")  
    @Transactional  
    @APIResponse(
        responseCode = "200",
        description = "ProdutoDto",
        content = {@Content(
            mediaType = "application/json", 
            schema = @Schema(implementation = ProdutoDto.class)
        )})
    public void deletar(@PathParam("id") Long id) {  
        service.deletar(id);
    }  


}