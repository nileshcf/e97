package com.cloudframe.app.bm8090m.dto;

/**
*  The class Pe8090r is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Pe8090r extends Pe8090rSerialized { 
   

								private short indtipidef;

						private char[] desnombre = Field.fillLowValue(60);

						private char[] despriapel = Field.fillLowValue(100);

						private char[] dessegapel = Field.fillLowValue(60);

						private char[] sepapell = Field.fillLowValue(1);

						private char[] indidioma = Field.fillLowValue(2);
	
	/**
	* Constructor for Pe8090r
	**/
    public Pe8090r() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Pe8090r. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pe8090r(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	public short getIndtipidef() throws CFException {
        if (isIndtipidefModified()) { 
           indtipidef = refreshIndtipidef();
        }
   		return indtipidef;
	}
	
	/**
	 * 	Update Indtipidef with the passed value
	 *  Corresponding COBOL Variable is INDTIPIDEF
	 *	@param number
	 */
	public void setIndtipidef(short number) {
			indtipidef = checkIndtipidefMaxLimit(number); // Truncate if value is beyond +/- Max range	
		serializeIndtipidef(indtipidef);
	}

	public void setIndtipidef(int number) {
	    number = checkIndtipidefMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIndtipidef((short)number);
	}
	public void setIndtipidef(long number) {
	    number = checkIndtipidefMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIndtipidef((short)number);
	}
	

	
	/**
	 *	Test condition 1 for isDni()
	 *	@return  Returns true if isDni() is 1
	 */
   public boolean isDni() throws CFException {
      return (  getIndtipidef()  ==  1  );
   }


	/**
	*  set values 1
	*/
   	public void setDniTrue() {  			
    	setIndtipidef( (short)1);
   	}
	
	/**
	 *	Test condition 3 for isExtranjeroTarjetaResidente()
	 *	@return  Returns true if isExtranjeroTarjetaResidente() is 3
	 */
   public boolean isExtranjeroTarjetaResidente() throws CFException {
      return (  getIndtipidef()  ==  3  );
   }


	/**
	*  set values 3
	*/
   	public void setExtranjeroTarjetaResidenteTrue() {  			
    	setIndtipidef( (short)3);
   	}
	
	/**
	 *	Test condition 4 for isExtranjeroDocumentoIdentif()
	 *	@return  Returns true if isExtranjeroDocumentoIdentif() is 4
	 */
   public boolean isExtranjeroDocumentoIdentif() throws CFException {
      return (  getIndtipidef()  ==  4  );
   }


	/**
	*  set values 4
	*/
   	public void setExtranjeroDocumentoIdentifTrue() {  			
    	setIndtipidef( (short)4);
   	}
	
	/**
	 *	Test condition 5 for isNif()
	 *	@return  Returns true if isNif() is 5
	 */
   public boolean isNif() throws CFException {
      return (  getIndtipidef()  ==  5  );
   }


	/**
	*  set values 5
	*/
   	public void setNifTrue() {  			
    	setIndtipidef( (short)5);
   	}
	
	/**
	 *	Test condition 6 for isCif()
	 *	@return  Returns true if isCif() is 6
	 */
   public boolean isCif() throws CFException {
      return (  getIndtipidef()  ==  6  );
   }


	/**
	*  set values 6
	*/
   	public void setCifTrue() {  			
    	setIndtipidef( (short)6);
   	}
	
	/**
	 *	Test condition 8 for isCifDiscriminador()
	 *	@return  Returns true if isCifDiscriminador() is 8
	 */
   public boolean isCifDiscriminador() throws CFException {
      return (  getIndtipidef()  ==  8  );
   }


	/**
	*  set values 8
	*/
   	public void setCifDiscriminadorTrue() {  			
    	setIndtipidef( (short)8);
   	}
	
	/**
	 *	Test condition 10 for isCifExtranjero()
	 *	@return  Returns true if isCifExtranjero() is 10
	 */
   public boolean isCifExtranjero() throws CFException {
      return (  getIndtipidef()  ==  10  );
   }


	/**
	*  set values 10
	*/
   	public void setCifExtranjeroTrue() {  			
    	setIndtipidef( (short)10);
   	}
	
	/**
	 *	Test condition 11 for isNiePersonaFisica()
	 *	@return  Returns true if isNiePersonaFisica() is 11
	 */
   public boolean isNiePersonaFisica() throws CFException {
      return (  getIndtipidef()  ==  11  );
   }


	/**
	*  set values 11
	*/
   	public void setNiePersonaFisicaTrue() {  			
    	setIndtipidef( (short)11);
   	}
	
	/**
	 *	Test condition 12 for isNiePersonaJuridica()
	 *	@return  Returns true if isNiePersonaJuridica() is 12
	 */
   public boolean isNiePersonaJuridica() throws CFException {
      return (  getIndtipidef()  ==  12  );
   }


	/**
	*  set values 12
	*/
   	public void setNiePersonaJuridicaTrue() {  			
    	setIndtipidef( (short)12);
   	}
	
	/**
	 *	Test condition 13 for isPasaporteEspanol()
	 *	@return  Returns true if isPasaporteEspanol() is 13
	 */
   public boolean isPasaporteEspanol() throws CFException {
      return (  getIndtipidef()  ==  13  );
   }


	/**
	*  set values 13
	*/
   	public void setPasaporteEspanolTrue() {  			
    	setIndtipidef( (short)13);
   	}
	
	/**
	 *	Test condition 91 for isGrupoDeRiesgo()
	 *	@return  Returns true if isGrupoDeRiesgo() is 91
	 */
   public boolean isGrupoDeRiesgo() throws CFException {
      return (  getIndtipidef()  ==  91  );
   }


	/**
	*  set values 91
	*/
   	public void setGrupoDeRiesgoTrue() {  			
    	setIndtipidef( (short)91);
   	}
	
	/**
	 *	Test condition 92 for isGrupoDeGestion()
	 *	@return  Returns true if isGrupoDeGestion() is 92
	 */
   public boolean isGrupoDeGestion() throws CFException {
      return (  getIndtipidef()  ==  92  );
   }


	/**
	*  set values 92
	*/
   	public void setGrupoDeGestionTrue() {  			
    	setIndtipidef( (short)92);
   	}
	
	/**
	 *	Test condition 93 for isNombreComercial()
	 *	@return  Returns true if isNombreComercial() is 93
	 */
   public boolean isNombreComercial() throws CFException {
      return (  getIndtipidef()  ==  93  );
   }


	/**
	*  set values 93
	*/
   	public void setNombreComercialTrue() {  			
    	setIndtipidef( (short)93);
   	}
	
	/**
	 *	Test condition 99 for isMenorDeEdad()
	 *	@return  Returns true if isMenorDeEdad() is 99
	 */
   public boolean isMenorDeEdad() throws CFException {
      return (  getIndtipidef()  ==  99  );
   }


	/**
	*  set values 99
	*/
   	public void setMenorDeEdadTrue() {  			
    	setIndtipidef( (short)99);
   	}
	/**
	 *	Returns the value of desnombre
	 *	@return desnombre
	 */
   public char[] getDesnombre() throws CFException{
     if (isDesnombreModified()) { 
        desnombre = refreshDesnombre();
     }
   		return desnombre;
   }

  
	/**
	*  set variable desnombre
	*  Corresponding COBOL Variable is DESNOMBRE
	*  @param value
	**/
   public void setDesnombre(char[] value) {
      desnombre = checkDesnombreConstraints(value);
      serializeDesnombre(desnombre);
   } 

     /**
	 * 	Update Desnombre 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDesnombre(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDesnombre,desnombre.length);
   	
   }
   
   public void setDesnombre(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDesnombre,desnombre.length);
   	
   }
   
     /**
	 * 	Update Desnombre 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDesnombre(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDesnombre+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Desnombre with another Field
	 *	@param value
	 */
   public void setDesnombre(Field source) {
       replace(source,0,source.length(),beginDesnombre,DESNOMBRE_LEN);
   	
   }  
   
     /**
	 * 	Update Desnombre 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDesnombre(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDesnombre,DESNOMBRE_LEN);
   	
   }
   
     /**
	 * 	Update Desnombre 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDesnombre(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDesnombre+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of despriapel
	 *	@return despriapel
	 */
   public char[] getDespriapel() throws CFException{
     if (isDespriapelModified()) { 
        despriapel = refreshDespriapel();
     }
   		return despriapel;
   }

  
	/**
	*  set variable despriapel
	*  Corresponding COBOL Variable is DESPRIAPEL
	*  @param value
	**/
   public void setDespriapel(char[] value) {
      despriapel = checkDespriapelConstraints(value);
      serializeDespriapel(despriapel);
   } 

     /**
	 * 	Update Despriapel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDespriapel(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDespriapel,despriapel.length);
   	
   }
   
   public void setDespriapel(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDespriapel,despriapel.length);
   	
   }
   
     /**
	 * 	Update Despriapel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDespriapel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDespriapel+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Despriapel with another Field
	 *	@param value
	 */
   public void setDespriapel(Field source) {
       replace(source,0,source.length(),beginDespriapel,DESPRIAPEL_LEN);
   	
   }  
   
     /**
	 * 	Update Despriapel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDespriapel(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDespriapel,DESPRIAPEL_LEN);
   	
   }
   
     /**
	 * 	Update Despriapel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDespriapel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDespriapel+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dessegapel
	 *	@return dessegapel
	 */
   public char[] getDessegapel() throws CFException{
     if (isDessegapelModified()) { 
        dessegapel = refreshDessegapel();
     }
   		return dessegapel;
   }

  
	/**
	*  set variable dessegapel
	*  Corresponding COBOL Variable is DESSEGAPEL
	*  @param value
	**/
   public void setDessegapel(char[] value) {
      dessegapel = checkDessegapelConstraints(value);
      serializeDessegapel(dessegapel);
   } 

     /**
	 * 	Update Dessegapel 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDessegapel(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDessegapel,dessegapel.length);
   	
   }
   
   public void setDessegapel(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDessegapel,dessegapel.length);
   	
   }
   
     /**
	 * 	Update Dessegapel 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDessegapel(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDessegapel+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Dessegapel with another Field
	 *	@param value
	 */
   public void setDessegapel(Field source) {
       replace(source,0,source.length(),beginDessegapel,DESSEGAPEL_LEN);
   	
   }  
   
     /**
	 * 	Update Dessegapel 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDessegapel(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDessegapel,DESSEGAPEL_LEN);
   	
   }
   
     /**
	 * 	Update Dessegapel 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDessegapel(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDessegapel+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of sepapell
	 *	@return sepapell
	 */
   public char[] getSepapell() throws CFException{
     if (isSepapellModified()) { 
        sepapell = refreshSepapell();
     }
   		return sepapell;
   }

  
	/**
	*  set variable sepapell
	*  Corresponding COBOL Variable is SEPAPELL
	*  @param value
	**/
   public void setSepapell(char[] value) {
      sepapell = checkSepapellConstraints(value);
      serializeSepapell(sepapell);
   } 

     /**
	 * 	Update Sepapell 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setSepapell(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginSepapell,sepapell.length);
   	
   }
   
   public void setSepapell(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginSepapell,sepapell.length);
   	
   }
   
     /**
	 * 	Update Sepapell 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setSepapell(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSepapell+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Sepapell with another Field
	 *	@param value
	 */
   public void setSepapell(Field source) {
       replace(source,0,source.length(),beginSepapell,SEPAPELL_LEN);
   	
   }  
   
     /**
	 * 	Update Sepapell 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setSepapell(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginSepapell,SEPAPELL_LEN);
   	
   }
   
     /**
	 * 	Update Sepapell 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setSepapell(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginSepapell+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of indidioma
	 *	@return indidioma
	 */
   public char[] getIndidioma() throws CFException{
     if (isIndidiomaModified()) { 
        indidioma = refreshIndidioma();
     }
   		return indidioma;
   }

  
	/**
	*  set variable indidioma
	*  Corresponding COBOL Variable is INDIDIOMA
	*  @param value
	**/
   public void setIndidioma(char[] value) {
      indidioma = checkIndidiomaConstraints(value);
      serializeIndidioma(indidioma);
   } 

     /**
	 * 	Update Indidioma 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIndidioma(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIndidioma,indidioma.length);
   	
   }
   
   public void setIndidioma(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIndidioma,indidioma.length);
   	
   }
   
     /**
	 * 	Update Indidioma 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIndidioma(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIndidioma+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Indidioma with another Field
	 *	@param value
	 */
   public void setIndidioma(Field source) {
       replace(source,0,source.length(),beginIndidioma,INDIDIOMA_LEN);
   	
   }  
   
     /**
	 * 	Update Indidioma 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIndidioma(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIndidioma,INDIDIOMA_LEN);
   	
   }
   
     /**
	 * 	Update Indidioma 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIndidioma(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIndidioma+targetIndex,targetLen);
    
   }
	char[] catellano88Value = "C ".toCharArray();
	/**
	 *	Test condition "C" for isCatellano()
	 *	@return  Returns true if isCatellano() is "C"
	 */
   public boolean isCatellano() throws CFException {
      return (  compareChars( getIndidioma() , catellano88Value)  == 0  );
   }


	/**
	*  set values "C"
	*/
   	public void setCatellanoTrue() {  			
    	setIndidioma( catellano88Value);
   	}
	char[] euskera88Value = "E ".toCharArray();
	/**
	 *	Test condition "E" for isEuskera()
	 *	@return  Returns true if isEuskera() is "E"
	 */
   public boolean isEuskera() throws CFException {
      return (  compareChars( getIndidioma() , euskera88Value)  == 0  );
   }


	/**
	*  set values "E"
	*/
   	public void setEuskeraTrue() {  			
    	setIndidioma( euskera88Value);
   	}
	char[] frances88Value = "F ".toCharArray();
	/**
	 *	Test condition "F" for isFrances()
	 *	@return  Returns true if isFrances() is "F"
	 */
   public boolean isFrances() throws CFException {
      return (  compareChars( getIndidioma() , frances88Value)  == 0  );
   }


	/**
	*  set values "F"
	*/
   	public void setFrancesTrue() {  			
    	setIndidioma( frances88Value);
   	}
	char[] catalan88Value = "T ".toCharArray();
	/**
	 *	Test condition "T" for isCatalan()
	 *	@return  Returns true if isCatalan() is "T"
	 */
   public boolean isCatalan() throws CFException {
      return (  compareChars( getIndidioma() , catalan88Value)  == 0  );
   }


	/**
	*  set values "T"
	*/
   	public void setCatalanTrue() {  			
    	setIndidioma( catalan88Value);
   	}
	char[] valenciano88Value = "V ".toCharArray();
	/**
	 *	Test condition "V" for isValenciano()
	 *	@return  Returns true if isValenciano() is "V"
	 */
   public boolean isValenciano() throws CFException {
      return (  compareChars( getIndidioma() , valenciano88Value)  == 0  );
   }


	/**
	*  set values "V"
	*/
   	public void setValencianoTrue() {  			
    	setIndidioma( valenciano88Value);
   	}

	
	
	

		public static int getPe8090rFieldLength() {
			return PE_8090R_LENGTH;
		}

}
  
