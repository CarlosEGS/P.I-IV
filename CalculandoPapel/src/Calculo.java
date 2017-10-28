
public class Calculo {
    public float altura;
    public float alturaMedia;
    public float montagemLateral;
    public float qtdEtiquetas; 
    public float part1;
    public float part2;
    public float part3;

    
    public float Calculo(){
        part1 = (float)((getAltura()) + (getAlturaMedia()) / 1000);
        part2 = part1 * (float)(getEtiquetasUnidades());
        part3 = part2 / (float)(getMontagemLateral());
        
        return part3; 
        
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
    

