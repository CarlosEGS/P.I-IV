
public class Calculo {
    public float altura;
    public float alturaMedia;
    public float montagemLateral;
    public float qtdEtiquetas; 
    
    
    public Calculo(){
        altura = 0;
        alturaMedia = 0;
        montagemLateral = 0;
        qtdEtiquetas = 0; 
       
        
    }

    public float Calculo(){        
        return (float)(((getAltura()) + (getAlturaMedia())/ 1000) * (getEtiquetasUnidades())) / (getMontagemLateral());
        
    }
    
    public float getAltura() {
        return altura;
    }
    
    public void setAlturaMedia(float alturaMedia){
        this.alturaMedia = alturaMedia;
    }
    
    public float getAlturaMedia(){
        return alturaMedia;
    }

   
    public void setAltura(float altura) {
        this.altura = altura;
    }
   
    public float getMontagemLateral() {
        return montagemLateral;
    }

    
    public void setMontagemLateral(float montagemLateral) {
        this.montagemLateral = montagemLateral;
    }

    
    public float getEtiquetasUnidades() {
        return qtdEtiquetas;
    }

    
    public void setEtiquetasUnidades(float qtdEtiquetas) {
        this.qtdEtiquetas = qtdEtiquetas;
    }
    
}
    

