package com.cloudframe.app.bm80022.dto;

/**
*  The class AbendLinea6 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/


import com.cloudframe.app.bm80022.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AbendLinea6 extends AbendLinea6Serialized {
   

						private char[] filler601 = new char[1];

						private char[] filler10 = new char[9];

								private long abendSqlcode;

						private char[] filler14 = new char[1];

						private char[] abendCodigo = new char[3];

						private char[] filler15 = new char[1];

						private char[] filler12 = new char[9];

						private char[] abendSqlwarn = new char[8];

						private char[] filler16 = new char[7];

						private char[] filler13 = new char[9];

						private char[] abendTabla = new char[7];

						private char[] filler17 = new char[13];

						private char[] filler801 = new char[1];
	
	/**
	* Constructor for AbendLinea6
	**/
    public AbendLinea6() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setFiller601(("*").toCharArray());
								setFiller10(("CODIGO : ").toCharArray());
								setFiller14(fillSpace(1));
								setAbendCodigo(fillSpace(3));
								setFiller15(fillSpace(1));
								setFiller12(("WARNING: ").toCharArray());
								setAbendSqlwarn(fillSpace(8));
								setFiller16(fillSpace(7));
								setFiller13(("TABLA  : ").toCharArray());
								setAbendTabla(fillSpace(7));
								setFiller17(fillSpace(13));
								setFiller801(("*").toCharArray());
    }


 

	/**
	 *	Returns the value of filler601
	 *	@return filler601
	 */
   public char[] getFiller601() throws CFException{
     if (isFiller601Modified()) { 
        filler601 = refreshFiller601();
     }
   		return filler601;
   }

  
	/**
	*  set variable filler601
	*  Corresponding COBOL Variable is FILLER6
	*  @param value
	**/
   public void setFiller601(char[] value) {
      filler601 = checkFiller601Constraints(value);
      serializeFiller601(filler601);
   } 

     /**
	 * 	Update Filler601 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller601(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller601,filler601.length);
   	
   }
   
   public void setFiller601(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller601,filler601.length);
   	
   }
   
     /**
	 * 	Update Filler601 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller601(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller601+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler601 with another Field
	 *	@param value
	 */
   public void setFiller601(Field source) {
       replace(source,0,source.length(),beginFiller601,FILLER_601_LEN);
   	
   }  
   
     /**
	 * 	Update Filler601 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller601(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller601,FILLER_601_LEN);
   	
   }
   
     /**
	 * 	Update Filler601 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller601(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller601+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler10
	 *	@return filler10
	 */
   public char[] getFiller10() throws CFException{
     if (isFiller10Modified()) { 
        filler10 = refreshFiller10();
     }
   		return filler10;
   }

  
	/**
	*  set variable filler10
	*  Corresponding COBOL Variable is FILLER10
	*  @param value
	**/
   public void setFiller10(char[] value) {
      filler10 = checkFiller10Constraints(value);
      serializeFiller10(filler10);
   } 

     /**
	 * 	Update Filler10 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller10(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller10,filler10.length);
   	
   }
   
   public void setFiller10(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller10,filler10.length);
   	
   }
   
     /**
	 * 	Update Filler10 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller10(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller10+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler10 with another Field
	 *	@param value
	 */
   public void setFiller10(Field source) {
       replace(source,0,source.length(),beginFiller10,FILLER_10_LEN);
   	
   }  
   
     /**
	 * 	Update Filler10 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller10(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller10,FILLER_10_LEN);
   	
   }
   
     /**
	 * 	Update Filler10 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller10(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller10+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of abendSqlcode
	 *	@return abendSqlcode
	 */
	public long getAbendSqlcode() throws CFException {
       if (isAbendSqlcodeModified()) { 
           abendSqlcode = refreshAbendSqlcode();
        }
   		return abendSqlcode;
	}
	

    /**
	 *	Returns the String value of abendSqlcode
	 *	@return abendSqlcode
	 */
	public char[]  getAbendSqlcodeActualString() {
	    String value = String.valueOf(abendSqlcode).trim();
		if(value.startsWith("+") || value.startsWith("-")) {
			value = value.substring(1);
		}
		return value.toCharArray();	
	}
	
	   
	/**
	 * 	Update AbendSqlcode with the passed value
	 *  Corresponding COBOL Variable is ABEND-SQLCODE
	 *	@param number
	 */
	public void setAbendSqlcode(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    abendSqlcode = checkAbendSqlcodeMaxLimit(number); 
		serializeAbendSqlcode(abendSqlcode);
	}
	

	/**
	 * 	Update AbendSqlcode with the passed value
	 *	@param value (String or char[])
	 */
	public void setAbendSqlcode(char[] value) throws CFException {
		 abendSqlcode = serializeAbendSqlcode(value);
	}
	/**
	 * 	Update AbendSqlcode with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setAbendSqlcodeString(char[] value) throws CFException {
		 setAbendSqlcode(value);
	}
	/**
	 *	Returns the value of filler14
	 *	@return filler14
	 */
   public char[] getFiller14() throws CFException{
     if (isFiller14Modified()) { 
        filler14 = refreshFiller14();
     }
   		return filler14;
   }

  
	/**
	*  set variable filler14
	*  Corresponding COBOL Variable is FILLER14
	*  @param value
	**/
   public void setFiller14(char[] value) {
      filler14 = checkFiller14Constraints(value);
      serializeFiller14(filler14);
   } 

     /**
	 * 	Update Filler14 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller14(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller14,filler14.length);
   	
   }
   
   public void setFiller14(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller14,filler14.length);
   	
   }
   
     /**
	 * 	Update Filler14 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller14(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller14+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler14 with another Field
	 *	@param value
	 */
   public void setFiller14(Field source) {
       replace(source,0,source.length(),beginFiller14,FILLER_14_LEN);
   	
   }  
   
     /**
	 * 	Update Filler14 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller14(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller14,FILLER_14_LEN);
   	
   }
   
     /**
	 * 	Update Filler14 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller14(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller14+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of abendCodigo
	 *	@return abendCodigo
	 */
   public char[] getAbendCodigo() throws CFException{
     if (isAbendCodigoModified()) { 
        abendCodigo = refreshAbendCodigo();
     }
   		return abendCodigo;
   }

  
	/**
	*  set variable abendCodigo
	*  Corresponding COBOL Variable is ABEND-CODIGO
	*  @param value
	**/
   public void setAbendCodigo(char[] value) {
      abendCodigo = checkAbendCodigoConstraints(value);
      serializeAbendCodigo(abendCodigo);
   } 

     /**
	 * 	Update AbendCodigo 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendCodigo(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendCodigo,abendCodigo.length);
   	
   }
   
   public void setAbendCodigo(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendCodigo,abendCodigo.length);
   	
   }
   
     /**
	 * 	Update AbendCodigo 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendCodigo(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendCodigo+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendCodigo with another Field
	 *	@param value
	 */
   public void setAbendCodigo(Field source) {
       replace(source,0,source.length(),beginAbendCodigo,ABEND_CODIGO_LEN);
   	
   }  
   
     /**
	 * 	Update AbendCodigo 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendCodigo(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendCodigo,ABEND_CODIGO_LEN);
   	
   }
   
     /**
	 * 	Update AbendCodigo 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendCodigo(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendCodigo+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler15
	 *	@return filler15
	 */
   public char[] getFiller15() throws CFException{
     if (isFiller15Modified()) { 
        filler15 = refreshFiller15();
     }
   		return filler15;
   }

  
	/**
	*  set variable filler15
	*  Corresponding COBOL Variable is FILLER15
	*  @param value
	**/
   public void setFiller15(char[] value) {
      filler15 = checkFiller15Constraints(value);
      serializeFiller15(filler15);
   } 

     /**
	 * 	Update Filler15 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller15(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller15,filler15.length);
   	
   }
   
   public void setFiller15(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller15,filler15.length);
   	
   }
   
     /**
	 * 	Update Filler15 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller15(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller15+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler15 with another Field
	 *	@param value
	 */
   public void setFiller15(Field source) {
       replace(source,0,source.length(),beginFiller15,FILLER_15_LEN);
   	
   }  
   
     /**
	 * 	Update Filler15 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller15(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller15,FILLER_15_LEN);
   	
   }
   
     /**
	 * 	Update Filler15 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller15(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller15+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler12
	 *	@return filler12
	 */
   public char[] getFiller12() throws CFException{
     if (isFiller12Modified()) { 
        filler12 = refreshFiller12();
     }
   		return filler12;
   }

  
	/**
	*  set variable filler12
	*  Corresponding COBOL Variable is FILLER12
	*  @param value
	**/
   public void setFiller12(char[] value) {
      filler12 = checkFiller12Constraints(value);
      serializeFiller12(filler12);
   } 

     /**
	 * 	Update Filler12 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller12(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller12,filler12.length);
   	
   }
   
   public void setFiller12(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller12,filler12.length);
   	
   }
   
     /**
	 * 	Update Filler12 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller12(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller12+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler12 with another Field
	 *	@param value
	 */
   public void setFiller12(Field source) {
       replace(source,0,source.length(),beginFiller12,FILLER_12_LEN);
   	
   }  
   
     /**
	 * 	Update Filler12 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller12(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller12,FILLER_12_LEN);
   	
   }
   
     /**
	 * 	Update Filler12 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller12(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller12+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of abendSqlwarn
	 *	@return abendSqlwarn
	 */
   public char[] getAbendSqlwarn() throws CFException{
     if (isAbendSqlwarnModified()) { 
        abendSqlwarn = refreshAbendSqlwarn();
     }
   		return abendSqlwarn;
   }

  
	/**
	*  set variable abendSqlwarn
	*  Corresponding COBOL Variable is ABEND-SQLWARN
	*  @param value
	**/
   public void setAbendSqlwarn(char[] value) {
      abendSqlwarn = checkAbendSqlwarnConstraints(value);
      serializeAbendSqlwarn(abendSqlwarn);
   } 

     /**
	 * 	Update AbendSqlwarn 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSqlwarn(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendSqlwarn,abendSqlwarn.length);
   	
   }
   
   public void setAbendSqlwarn(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendSqlwarn,abendSqlwarn.length);
   	
   }
   
     /**
	 * 	Update AbendSqlwarn 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlwarn(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendSqlwarn+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendSqlwarn with another Field
	 *	@param value
	 */
   public void setAbendSqlwarn(Field source) {
       replace(source,0,source.length(),beginAbendSqlwarn,ABEND_SQLWARN_LEN);
   	
   }  
   
     /**
	 * 	Update AbendSqlwarn 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSqlwarn(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendSqlwarn,ABEND_SQLWARN_LEN);
   	
   }
   
     /**
	 * 	Update AbendSqlwarn 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSqlwarn(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendSqlwarn+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler16
	 *	@return filler16
	 */
   public char[] getFiller16() throws CFException{
     if (isFiller16Modified()) { 
        filler16 = refreshFiller16();
     }
   		return filler16;
   }

  
	/**
	*  set variable filler16
	*  Corresponding COBOL Variable is FILLER16
	*  @param value
	**/
   public void setFiller16(char[] value) {
      filler16 = checkFiller16Constraints(value);
      serializeFiller16(filler16);
   } 

     /**
	 * 	Update Filler16 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller16(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller16,filler16.length);
   	
   }
   
   public void setFiller16(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller16,filler16.length);
   	
   }
   
     /**
	 * 	Update Filler16 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller16(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller16+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler16 with another Field
	 *	@param value
	 */
   public void setFiller16(Field source) {
       replace(source,0,source.length(),beginFiller16,FILLER_16_LEN);
   	
   }  
   
     /**
	 * 	Update Filler16 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller16(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller16,FILLER_16_LEN);
   	
   }
   
     /**
	 * 	Update Filler16 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller16(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller16+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler13
	 *	@return filler13
	 */
   public char[] getFiller13() throws CFException{
     if (isFiller13Modified()) { 
        filler13 = refreshFiller13();
     }
   		return filler13;
   }

  
	/**
	*  set variable filler13
	*  Corresponding COBOL Variable is FILLER13
	*  @param value
	**/
   public void setFiller13(char[] value) {
      filler13 = checkFiller13Constraints(value);
      serializeFiller13(filler13);
   } 

     /**
	 * 	Update Filler13 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller13(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller13,filler13.length);
   	
   }
   
   public void setFiller13(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller13,filler13.length);
   	
   }
   
     /**
	 * 	Update Filler13 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller13(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller13+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler13 with another Field
	 *	@param value
	 */
   public void setFiller13(Field source) {
       replace(source,0,source.length(),beginFiller13,FILLER_13_LEN);
   	
   }  
   
     /**
	 * 	Update Filler13 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller13(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller13,FILLER_13_LEN);
   	
   }
   
     /**
	 * 	Update Filler13 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller13(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller13+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of abendTabla
	 *	@return abendTabla
	 */
   public char[] getAbendTabla() throws CFException{
     if (isAbendTablaModified()) { 
        abendTabla = refreshAbendTabla();
     }
   		return abendTabla;
   }

  
	/**
	*  set variable abendTabla
	*  Corresponding COBOL Variable is ABEND-TABLA
	*  @param value
	**/
   public void setAbendTabla(char[] value) {
      abendTabla = checkAbendTablaConstraints(value);
      serializeAbendTabla(abendTabla);
   } 

     /**
	 * 	Update AbendTabla 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendTabla(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendTabla,abendTabla.length);
   	
   }
   
   public void setAbendTabla(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendTabla,abendTabla.length);
   	
   }
   
     /**
	 * 	Update AbendTabla 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendTabla(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendTabla+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendTabla with another Field
	 *	@param value
	 */
   public void setAbendTabla(Field source) {
       replace(source,0,source.length(),beginAbendTabla,ABEND_TABLA_LEN);
   	
   }  
   
     /**
	 * 	Update AbendTabla 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendTabla(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendTabla,ABEND_TABLA_LEN);
   	
   }
   
     /**
	 * 	Update AbendTabla 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendTabla(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendTabla+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler17
	 *	@return filler17
	 */
   public char[] getFiller17() throws CFException{
     if (isFiller17Modified()) { 
        filler17 = refreshFiller17();
     }
   		return filler17;
   }

  
	/**
	*  set variable filler17
	*  Corresponding COBOL Variable is FILLER17
	*  @param value
	**/
   public void setFiller17(char[] value) {
      filler17 = checkFiller17Constraints(value);
      serializeFiller17(filler17);
   } 

     /**
	 * 	Update Filler17 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller17(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller17,filler17.length);
   	
   }
   
   public void setFiller17(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller17,filler17.length);
   	
   }
   
     /**
	 * 	Update Filler17 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller17(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller17+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler17 with another Field
	 *	@param value
	 */
   public void setFiller17(Field source) {
       replace(source,0,source.length(),beginFiller17,FILLER_17_LEN);
   	
   }  
   
     /**
	 * 	Update Filler17 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller17(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller17,FILLER_17_LEN);
   	
   }
   
     /**
	 * 	Update Filler17 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller17(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller17+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler801
	 *	@return filler801
	 */
   public char[] getFiller801() throws CFException{
     if (isFiller801Modified()) { 
        filler801 = refreshFiller801();
     }
   		return filler801;
   }

  
	/**
	*  set variable filler801
	*  Corresponding COBOL Variable is FILLER8
	*  @param value
	**/
   public void setFiller801(char[] value) {
      filler801 = checkFiller801Constraints(value);
      serializeFiller801(filler801);
   } 

     /**
	 * 	Update Filler801 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller801(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller801,filler801.length);
   	
   }
   
   public void setFiller801(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller801,filler801.length);
   	
   }
   
     /**
	 * 	Update Filler801 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller801(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller801+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler801 with another Field
	 *	@param value
	 */
   public void setFiller801(Field source) {
       replace(source,0,source.length(),beginFiller801,FILLER_801_LEN);
   	
   }  
   
     /**
	 * 	Update Filler801 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller801(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller801,FILLER_801_LEN);
   	
   }
   
     /**
	 * 	Update Filler801 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller801(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller801+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAbendLinea6FieldLength() {
			return ABEND_LINEA_6_LENGTH;
		}

}
  
