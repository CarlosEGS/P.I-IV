
public class Calculo {
    public float altura = 40;
    public float alturaMedia = 2;
    public float montagemLateral = 3;
    public float qtdEtiquetas = 100; 
   
    
    
    
    
    public int somaDivisao(int a, int b){
        return  (a+b)/100;
        
    }
    
    public int somaDivisaoMutiplicacao(int a, int b, int c){
        return ((a+b)/100) * c;
    }
    
    public int somaDivisiaoMutiplicacaoDivisao(int a, int b, int c, int d){
        return (((a+b)/100) * c) / d;
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
    

