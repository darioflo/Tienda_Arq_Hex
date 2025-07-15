package mx.com.santander.hexagonalmodularmaven.cliente.model.entity;
import mx.com.santander.hexagonalmodularmaven.cliente.model.dto.command.ClienteCreateCommand;


public class Cliente {
    private ClienteId id;
    private ClienteNombre nombre;
    private ClienteApellido apellido;
    private ClienteEmail email;
    private ClienteDireccion direccion;
    private ClienteTelefono telefono;

    public Cliente (Long id, String nombre, String apellido, String email, String direccion, String telefono){
        this.id = new ClienteId(id);
        this.nombre = new ClienteNombre(nombre);
        this.apellido = new ClienteApellido(apellido);
        this.email = new ClienteEmail(email);
        this.direccion = new ClienteDireccion(direccion);
        this.telefono = new ClienteTelefono(telefono);
    }

    public Cliente(){}

    public Cliente requestToCreate(ClienteCreateCommand clienteCreateCommand){
        this.nombre = new ClienteNombre(clienteCreateCommand.getNombre());
        this.apellido = new ClienteApellido(clienteCreateCommand.getApellido());
        this.email = new ClienteEmail(clienteCreateCommand.getEmail());
        this.direccion = new ClienteDireccion(clienteCreateCommand.getDireccion());
        this.telefono = new ClienteTelefono(clienteCreateCommand.getTelefono());
        return this;
    }

    public Long getId(){
        return this.id.getId();
    }

    public String getNombre(){
        return this.nombre.getNombre();
    }

    public String getApellido(){
        return this.apellido.getApellido();
    }

    public String getEmail(){
        return this.email.getEmail();
    }

    public String getDireccion(){
        return this.direccion.getDireccion();
    }

    public String getTelefono(){
        return this.telefono.getTelefono();
    }
}
