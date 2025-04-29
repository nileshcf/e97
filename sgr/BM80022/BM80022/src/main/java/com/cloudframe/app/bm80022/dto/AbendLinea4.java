package com.cloudframe.app.bm80022.dto;

/**
*  The class AbendLinea4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/


import com.cloudframe.app.bm80022.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AbendLinea4 extends AbendLinea4Serialized {
   

						private char[] filler6 = new char[1];

						private char[] filler7 = new char[10];

						private char[] abendMensaje = new char[68];

						private char[] filler8 = new char[1];
	
	/**
	* Constructor for AbendLinea4
	**/
    public AbendLinea4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setFiller6(("*").toCharArray());
								setFiller7(("DESCRIP.: ").toCharArray());
								setAbendMensaje(pad(68," ".toCharArray(),' ',RIGHT_PAD));
								setFiller8(("*").toCharArray());
    }


 

	/**
	 *	Returns the value of filler6
	 *	@return filler6
	 */
   public char[] getFiller6() throws CFException{
     if (isFiller6Modified()) { 
        filler6 = refreshFiller6();
     }
   		return filler6;
   }

  
	/**
	*  set variable filler6
	*  Corresponding COBOL Variable is FILLER6
	*  @param value
	**/
   public void setFiller6(char[] value) {
      filler6 = checkFiller6Constraints(value);
      serializeFiller6(filler6);
   } 

     /**
	 * 	Update Filler6 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller6(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller6,filler6.length);
   	
   }
   
   public void setFiller6(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller6,filler6.length);
   	
   }
   
     /**
	 * 	Update Filler6 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller6(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller6+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler6 with another Field
	 *	@param value
	 */
   public void setFiller6(Field source) {
       replace(source,0,source.length(),beginFiller6,FILLER_6_LEN);
   	
   }  
   
     /**
	 * 	Update Filler6 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller6(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller6,FILLER_6_LEN);
   	
   }
   
     /**
	 * 	Update Filler6 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller6(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller6+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler7
	 *	@return filler7
	 */
   public char[] getFiller7() throws CFException{
     if (isFiller7Modified()) { 
        filler7 = refreshFiller7();
     }
   		return filler7;
   }

  
	/**
	*  set variable filler7
	*  Corresponding COBOL Variable is FILLER7
	*  @param value
	**/
   public void setFiller7(char[] value) {
      filler7 = checkFiller7Constraints(value);
      serializeFiller7(filler7);
   } 

     /**
	 * 	Update Filler7 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller7(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller7,filler7.length);
   	
   }
   
   public void setFiller7(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller7,filler7.length);
   	
   }
   
     /**
	 * 	Update Filler7 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller7(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller7+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler7 with another Field
	 *	@param value
	 */
   public void setFiller7(Field source) {
       replace(source,0,source.length(),beginFiller7,FILLER_7_LEN);
   	
   }  
   
     /**
	 * 	Update Filler7 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller7(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller7,FILLER_7_LEN);
   	
   }
   
     /**
	 * 	Update Filler7 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller7(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller7+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of abendMensaje
	 *	@return abendMensaje
	 */
   public char[] getAbendMensaje() throws CFException{
     if (isAbendMensajeModified()) { 
        abendMensaje = refreshAbendMensaje();
     }
   		return abendMensaje;
   }

  
	/**
	*  set variable abendMensaje
	*  Corresponding COBOL Variable is ABEND-MENSAJE
	*  @param value
	**/
   public void setAbendMensaje(char[] value) {
      abendMensaje = checkAbendMensajeConstraints(value);
      serializeAbendMensaje(abendMensaje);
   } 

     /**
	 * 	Update AbendMensaje 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendMensaje(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendMensaje,abendMensaje.length);
   	
   }
   
   public void setAbendMensaje(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendMensaje,abendMensaje.length);
   	
   }
   
     /**
	 * 	Update AbendMensaje 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendMensaje(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendMensaje+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendMensaje with another Field
	 *	@param value
	 */
   public void setAbendMensaje(Field source) {
       replace(source,0,source.length(),beginAbendMensaje,ABEND_MENSAJE_LEN);
   	
   }  
   
     /**
	 * 	Update AbendMensaje 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendMensaje(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendMensaje,ABEND_MENSAJE_LEN);
   	
   }
   
     /**
	 * 	Update AbendMensaje 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendMensaje(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendMensaje+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler8
	 *	@return filler8
	 */
   public char[] getFiller8() throws CFException{
     if (isFiller8Modified()) { 
        filler8 = refreshFiller8();
     }
   		return filler8;
   }

  
	/**
	*  set variable filler8
	*  Corresponding COBOL Variable is FILLER8
	*  @param value
	**/
   public void setFiller8(char[] value) {
      filler8 = checkFiller8Constraints(value);
      serializeFiller8(filler8);
   } 

     /**
	 * 	Update Filler8 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller8(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller8,filler8.length);
   	
   }
   
   public void setFiller8(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller8,filler8.length);
   	
   }
   
     /**
	 * 	Update Filler8 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller8(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller8+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler8 with another Field
	 *	@param value
	 */
   public void setFiller8(Field source) {
       replace(source,0,source.length(),beginFiller8,FILLER_8_LEN);
   	
   }  
   
     /**
	 * 	Update Filler8 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller8(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller8,FILLER_8_LEN);
   	
   }
   
     /**
	 * 	Update Filler8 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller8(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller8+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAbendLinea4FieldLength() {
			return ABEND_LINEA_4_LENGTH;
		}

}
  
