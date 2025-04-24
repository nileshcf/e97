package com.cloudframe.app.bm80022.dto;

/**
*  The class AbendLinea7 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/


import com.cloudframe.app.bm80022.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class AbendLinea7 extends AbendLinea7Serialized { 
   

						private char[] filler602 = new char[1];

						private char[] filler18 = new char[11];

						private char[] abendProg = new char[8];

						private char[] filler19 = new char[4];

						private char[] filler20 = new char[10];

						private char[] abendParraf = new char[10];

						private char[] filler21 = new char[2];

						private char[] filler22 = new char[12];

						private char[] abendSenten = new char[21];

						private char[] filler802 = new char[1];
	
	/**
	* Constructor for AbendLinea7
	**/
    public AbendLinea7() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setFiller602(("*").toCharArray());
								setFiller18(("PROGRAMA : ").toCharArray());
								setAbendProg(fillSpace(8));
								setFiller19(fillSpace(4));
								setFiller20(("PARRAFO : ").toCharArray());
								setAbendParraf(fillSpace(10));
								setFiller21(fillSpace(2));
								setFiller22(("SENTENCIA : ").toCharArray());
								setAbendSenten(fillSpace(21));
								setFiller802(("*").toCharArray());
    }


 

	/**
	 *	Returns the value of filler602
	 *	@return filler602
	 */
   public char[] getFiller602() throws CFException{
     if (isFiller602Modified()) { 
        filler602 = refreshFiller602();
     }
   		return filler602;
   }

  
	/**
	*  set variable filler602
	*  Corresponding COBOL Variable is FILLER6
	*  @param value
	**/
   public void setFiller602(char[] value) {
      filler602 = checkFiller602Constraints(value);
      serializeFiller602(filler602);
   } 

     /**
	 * 	Update Filler602 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller602(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller602,filler602.length);
   	
   }
   
   public void setFiller602(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller602,filler602.length);
   	
   }
   
     /**
	 * 	Update Filler602 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller602(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller602+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler602 with another Field
	 *	@param value
	 */
   public void setFiller602(Field source) {
       replace(source,0,source.length(),beginFiller602,FILLER_602_LEN);
   	
   }  
   
     /**
	 * 	Update Filler602 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller602(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller602,FILLER_602_LEN);
   	
   }
   
     /**
	 * 	Update Filler602 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller602(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller602+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler18
	 *	@return filler18
	 */
   public char[] getFiller18() throws CFException{
     if (isFiller18Modified()) { 
        filler18 = refreshFiller18();
     }
   		return filler18;
   }

  
	/**
	*  set variable filler18
	*  Corresponding COBOL Variable is FILLER18
	*  @param value
	**/
   public void setFiller18(char[] value) {
      filler18 = checkFiller18Constraints(value);
      serializeFiller18(filler18);
   } 

     /**
	 * 	Update Filler18 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller18(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller18,filler18.length);
   	
   }
   
   public void setFiller18(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller18,filler18.length);
   	
   }
   
     /**
	 * 	Update Filler18 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller18(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller18+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler18 with another Field
	 *	@param value
	 */
   public void setFiller18(Field source) {
       replace(source,0,source.length(),beginFiller18,FILLER_18_LEN);
   	
   }  
   
     /**
	 * 	Update Filler18 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller18(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller18,FILLER_18_LEN);
   	
   }
   
     /**
	 * 	Update Filler18 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller18(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller18+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of abendProg
	 *	@return abendProg
	 */
   public char[] getAbendProg() throws CFException{
     if (isAbendProgModified()) { 
        abendProg = refreshAbendProg();
     }
   		return abendProg;
   }

  
	/**
	*  set variable abendProg
	*  Corresponding COBOL Variable is ABEND-PROG
	*  @param value
	**/
   public void setAbendProg(char[] value) {
      abendProg = checkAbendProgConstraints(value);
      serializeAbendProg(abendProg);
   } 

     /**
	 * 	Update AbendProg 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendProg(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendProg,abendProg.length);
   	
   }
   
   public void setAbendProg(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendProg,abendProg.length);
   	
   }
   
     /**
	 * 	Update AbendProg 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendProg(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendProg+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendProg with another Field
	 *	@param value
	 */
   public void setAbendProg(Field source) {
       replace(source,0,source.length(),beginAbendProg,ABEND_PROG_LEN);
   	
   }  
   
     /**
	 * 	Update AbendProg 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendProg(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendProg,ABEND_PROG_LEN);
   	
   }
   
     /**
	 * 	Update AbendProg 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendProg(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendProg+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler19
	 *	@return filler19
	 */
   public char[] getFiller19() throws CFException{
     if (isFiller19Modified()) { 
        filler19 = refreshFiller19();
     }
   		return filler19;
   }

  
	/**
	*  set variable filler19
	*  Corresponding COBOL Variable is FILLER19
	*  @param value
	**/
   public void setFiller19(char[] value) {
      filler19 = checkFiller19Constraints(value);
      serializeFiller19(filler19);
   } 

     /**
	 * 	Update Filler19 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller19(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller19,filler19.length);
   	
   }
   
   public void setFiller19(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller19,filler19.length);
   	
   }
   
     /**
	 * 	Update Filler19 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller19(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller19+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler19 with another Field
	 *	@param value
	 */
   public void setFiller19(Field source) {
       replace(source,0,source.length(),beginFiller19,FILLER_19_LEN);
   	
   }  
   
     /**
	 * 	Update Filler19 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller19(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller19,FILLER_19_LEN);
   	
   }
   
     /**
	 * 	Update Filler19 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller19(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller19+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler20
	 *	@return filler20
	 */
   public char[] getFiller20() throws CFException{
     if (isFiller20Modified()) { 
        filler20 = refreshFiller20();
     }
   		return filler20;
   }

  
	/**
	*  set variable filler20
	*  Corresponding COBOL Variable is FILLER20
	*  @param value
	**/
   public void setFiller20(char[] value) {
      filler20 = checkFiller20Constraints(value);
      serializeFiller20(filler20);
   } 

     /**
	 * 	Update Filler20 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller20(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller20,filler20.length);
   	
   }
   
   public void setFiller20(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller20,filler20.length);
   	
   }
   
     /**
	 * 	Update Filler20 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller20(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller20+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler20 with another Field
	 *	@param value
	 */
   public void setFiller20(Field source) {
       replace(source,0,source.length(),beginFiller20,FILLER_20_LEN);
   	
   }  
   
     /**
	 * 	Update Filler20 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller20(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller20,FILLER_20_LEN);
   	
   }
   
     /**
	 * 	Update Filler20 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller20(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller20+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of abendParraf
	 *	@return abendParraf
	 */
   public char[] getAbendParraf() throws CFException{
     if (isAbendParrafModified()) { 
        abendParraf = refreshAbendParraf();
     }
   		return abendParraf;
   }

  
	/**
	*  set variable abendParraf
	*  Corresponding COBOL Variable is ABEND-PARRAF
	*  @param value
	**/
   public void setAbendParraf(char[] value) {
      abendParraf = checkAbendParrafConstraints(value);
      serializeAbendParraf(abendParraf);
   } 

     /**
	 * 	Update AbendParraf 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendParraf(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendParraf,abendParraf.length);
   	
   }
   
   public void setAbendParraf(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendParraf,abendParraf.length);
   	
   }
   
     /**
	 * 	Update AbendParraf 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendParraf(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendParraf+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendParraf with another Field
	 *	@param value
	 */
   public void setAbendParraf(Field source) {
       replace(source,0,source.length(),beginAbendParraf,ABEND_PARRAF_LEN);
   	
   }  
   
     /**
	 * 	Update AbendParraf 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendParraf(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendParraf,ABEND_PARRAF_LEN);
   	
   }
   
     /**
	 * 	Update AbendParraf 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendParraf(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendParraf+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler21
	 *	@return filler21
	 */
   public char[] getFiller21() throws CFException{
     if (isFiller21Modified()) { 
        filler21 = refreshFiller21();
     }
   		return filler21;
   }

  
	/**
	*  set variable filler21
	*  Corresponding COBOL Variable is FILLER21
	*  @param value
	**/
   public void setFiller21(char[] value) {
      filler21 = checkFiller21Constraints(value);
      serializeFiller21(filler21);
   } 

     /**
	 * 	Update Filler21 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller21(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller21,filler21.length);
   	
   }
   
   public void setFiller21(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller21,filler21.length);
   	
   }
   
     /**
	 * 	Update Filler21 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller21(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller21+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler21 with another Field
	 *	@param value
	 */
   public void setFiller21(Field source) {
       replace(source,0,source.length(),beginFiller21,FILLER_21_LEN);
   	
   }  
   
     /**
	 * 	Update Filler21 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller21(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller21,FILLER_21_LEN);
   	
   }
   
     /**
	 * 	Update Filler21 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller21(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller21+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler22
	 *	@return filler22
	 */
   public char[] getFiller22() throws CFException{
     if (isFiller22Modified()) { 
        filler22 = refreshFiller22();
     }
   		return filler22;
   }

  
	/**
	*  set variable filler22
	*  Corresponding COBOL Variable is FILLER22
	*  @param value
	**/
   public void setFiller22(char[] value) {
      filler22 = checkFiller22Constraints(value);
      serializeFiller22(filler22);
   } 

     /**
	 * 	Update Filler22 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller22(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller22,filler22.length);
   	
   }
   
   public void setFiller22(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller22,filler22.length);
   	
   }
   
     /**
	 * 	Update Filler22 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller22(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller22+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler22 with another Field
	 *	@param value
	 */
   public void setFiller22(Field source) {
       replace(source,0,source.length(),beginFiller22,FILLER_22_LEN);
   	
   }  
   
     /**
	 * 	Update Filler22 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller22(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller22,FILLER_22_LEN);
   	
   }
   
     /**
	 * 	Update Filler22 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller22(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller22+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of abendSenten
	 *	@return abendSenten
	 */
   public char[] getAbendSenten() throws CFException{
     if (isAbendSentenModified()) { 
        abendSenten = refreshAbendSenten();
     }
   		return abendSenten;
   }

  
	/**
	*  set variable abendSenten
	*  Corresponding COBOL Variable is ABEND-SENTEN
	*  @param value
	**/
   public void setAbendSenten(char[] value) {
      abendSenten = checkAbendSentenConstraints(value);
      serializeAbendSenten(abendSenten);
   } 

     /**
	 * 	Update AbendSenten 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setAbendSenten(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginAbendSenten,abendSenten.length);
   	
   }
   
   public void setAbendSenten(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginAbendSenten,abendSenten.length);
   	
   }
   
     /**
	 * 	Update AbendSenten 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setAbendSenten(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendSenten+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update AbendSenten with another Field
	 *	@param value
	 */
   public void setAbendSenten(Field source) {
       replace(source,0,source.length(),beginAbendSenten,ABEND_SENTEN_LEN);
   	
   }  
   
     /**
	 * 	Update AbendSenten 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setAbendSenten(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginAbendSenten,ABEND_SENTEN_LEN);
   	
   }
   
     /**
	 * 	Update AbendSenten 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setAbendSenten(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginAbendSenten+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of filler802
	 *	@return filler802
	 */
   public char[] getFiller802() throws CFException{
     if (isFiller802Modified()) { 
        filler802 = refreshFiller802();
     }
   		return filler802;
   }

  
	/**
	*  set variable filler802
	*  Corresponding COBOL Variable is FILLER8
	*  @param value
	**/
   public void setFiller802(char[] value) {
      filler802 = checkFiller802Constraints(value);
      serializeFiller802(filler802);
   } 

     /**
	 * 	Update Filler802 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFiller802(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFiller802,filler802.length);
   	
   }
   
   public void setFiller802(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFiller802,filler802.length);
   	
   }
   
     /**
	 * 	Update Filler802 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFiller802(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller802+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Filler802 with another Field
	 *	@param value
	 */
   public void setFiller802(Field source) {
       replace(source,0,source.length(),beginFiller802,FILLER_802_LEN);
   	
   }  
   
     /**
	 * 	Update Filler802 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFiller802(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFiller802,FILLER_802_LEN);
   	
   }
   
     /**
	 * 	Update Filler802 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFiller802(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFiller802+targetIndex,targetLen);
    
   }

	
	
	

		public static int getAbendLinea7FieldLength() {
			return ABEND_LINEA_7_LENGTH;
		}

}
  
