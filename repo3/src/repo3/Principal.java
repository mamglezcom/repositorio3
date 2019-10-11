package repo3;

import recursos.Constantes;
import vo.PrincipalVO;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		PrincipalVO principalVO = new PrincipalVO();
		Constantes constantes = new Constantes();
		nombre = principalVO.getNombre();
		System.out.println("Mi nombre es: " + nombre);
		System.out.println(constantes.NOMBRE);

	}

}
