package br.com.unitymanager.combobox;

public class ComboBoxString {

    private String tipoOS;
    
    public ComboBoxString(String tipo){
        this.tipoOS = tipo;
        
    }
    public String getTipoOS() {
        return tipoOS;
    }

    public void setTipoOS(String tipoOS) {
        this.tipoOS = tipoOS;
    }

    @Override
    public String toString() {
        return tipoOS;
    }
    
    
    
    
   
}
