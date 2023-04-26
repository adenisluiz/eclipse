package beans;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
@ManagedBean
public class MeuBean {
	
	@PostConstruct
	 public void init()
	{
		setUsuarioAtivo(true);
	}
	
	private boolean usuarioAtivo;

	public boolean isUsuarioAtivo() {
		return usuarioAtivo;
	}

	public void setUsuarioAtivo(boolean usuarioAtivo) {
		this.usuarioAtivo = usuarioAtivo;
	} 

}
