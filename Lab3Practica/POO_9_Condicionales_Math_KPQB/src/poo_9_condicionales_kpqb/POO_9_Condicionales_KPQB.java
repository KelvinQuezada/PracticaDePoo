
package poo_9_condicionales_kpqb;

public class POO_9_Condicionales_KPQB {

    public static void main(String[] args) {
    	// separar por clases de menor y mayor
		numero numero1=new numero();
		do{
		     //genramos un numero aleatorio entre 1 a 49
			numero1.n=(int) (Math.random()*49+1);
		// si no está repetido, lo guardamos en el array
		if(!repetido(numero1.n,numero1.nums, numero1.generados)){ 
			numero1.nums[numero1.generados]=numero1.n;
			numero1.generados++;
		}
		}while(numero1.generados<6);
		    ordenar(numero1.nums);
		    mostrar(numero1.nums);
		    }
		private static boolean repetido(int n, int[] nums, int generados){
		boolean res  = false;
		for(int i=0; i<generados; i++){
		if(n==nums[i]){
		res=true;
		break;
		}
		}
		return res;
		}
		private static void ordenar(int[]nums){
		    int aux;
		    for(int i=0;i<nums.length;i++)
		        for(int k=i;k<nums.length;k++){
		            aux=nums[i];
		            nums[i]=nums[k];
		            nums[k]=aux;
		                    }
		}
		private static void mostrar(int[]nums){
		 
		    for(int num:nums)
		        System.out.print(num+",");
		}
		}