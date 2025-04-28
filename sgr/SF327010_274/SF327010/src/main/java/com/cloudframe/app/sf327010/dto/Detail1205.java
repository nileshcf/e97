package com.cloudframe.app.sf327010.dto;

/**
*  The class Detail1205 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.sf327010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Detail1205 extends Detail1205Serialized { 
   




						private char[] lserviceDate205 = new char[2];


						private char[] lserviceMonth205 = new char[3];


						private char[] lserviceCentury205 = new char[2];

						private char[] lserviceYear205 = new char[2];


						private char[] lserviceHh205 = new char[2];


						private char[] lserviceMins205 = new char[2];


						private char[] lserviceSec205 = new char[2];




						private char[] hserviceDate205 = new char[2];


						private char[] hserviceMonth205 = new char[3];


						private char[] hserviceCentury205 = new char[2];

						private char[] hserviceYear205 = new char[2];


						private char[] hserviceHh205 = new char[2];


						private char[] hserviceMins205 = new char[2];


						private char[] hserviceSec205 = new char[2];

	
	/**
	* Constructor for Detail1205
	**/
    public Detail1205() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Detail1205. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Detail1205(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("REPORT ACTIVITY DATE RANGE").toCharArray()
             , getStartOffset() + 0
             ,26
             );
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 26
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 27
             ,1
             );
								setLserviceDate205(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 30
             ,1
             );
								setLserviceMonth205(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 34
             ,1
             );
								setLserviceCentury205(fillSpace(2));
								setLserviceYear205(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 39
             ,1
             );
								setLserviceHh205(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 42
             ,1
             );
								setLserviceMins205(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 45
             ,1
             );
								setLserviceSec205(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 48
             ,1
             );
       replaceValue( // serialize and save the value
             ("TO").toCharArray()
             , getStartOffset() + 49
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 51
             ,1
             );
								setHserviceDate205(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 54
             ,1
             );
								setHserviceMonth205(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 58
             ,1
             );
								setHserviceCentury205(fillSpace(2));
								setHserviceYear205(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 63
             ,1
             );
								setHserviceHh205(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 66
             ,1
             );
								setHserviceMins205(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 69
             ,1
             );
								setHserviceSec205(fillSpace(2));
       replaceValue( // serialize and save the value
             pad(60," ".toCharArray(),' ',RIGHT_PAD)
             , getStartOffset() + 72
             ,60
             );
    } 

	/**
	 *	Returns the value of lserviceDate205
	 *	@return lserviceDate205
	 */
   public char[] getLserviceDate205() throws CFException{
     if (isLserviceDate205Modified()) { 
        lserviceDate205 = refreshLserviceDate205();
     }
   		return lserviceDate205;
   }

  
	/**
	*  set variable lserviceDate205
	*  Corresponding COBOL Variable is 205-LSERVICE-DATE
	*  @param value
	**/
   public void setLserviceDate205(char[] value) {
      lserviceDate205 = checkLserviceDate205Constraints(value);
      serializeLserviceDate205(lserviceDate205);
   } 

     /**
	 * 	Update LserviceDate205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceDate205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceDate205,lserviceDate205.length);
   	
   }
   
   public void setLserviceDate205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceDate205,lserviceDate205.length);
   	
   }
   
     /**
	 * 	Update LserviceDate205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDate205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceDate205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceDate205 with another Field
	 *	@param value
	 */
   public void setLserviceDate205(Field source) {
       replace(source,0,source.length(),beginLserviceDate205,LSERVICE_DATE_205_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceDate205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceDate205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceDate205,LSERVICE_DATE_205_LEN);
   	
   }
   
     /**
	 * 	Update LserviceDate205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDate205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceDate205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceMonth205
	 *	@return lserviceMonth205
	 */
   public char[] getLserviceMonth205() throws CFException{
     if (isLserviceMonth205Modified()) { 
        lserviceMonth205 = refreshLserviceMonth205();
     }
   		return lserviceMonth205;
   }

  
	/**
	*  set variable lserviceMonth205
	*  Corresponding COBOL Variable is 205-LSERVICE-MONTH
	*  @param value
	**/
   public void setLserviceMonth205(char[] value) {
      lserviceMonth205 = checkLserviceMonth205Constraints(value);
      serializeLserviceMonth205(lserviceMonth205);
   } 

     /**
	 * 	Update LserviceMonth205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMonth205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceMonth205,lserviceMonth205.length);
   	
   }
   
   public void setLserviceMonth205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMonth205,lserviceMonth205.length);
   	
   }
   
     /**
	 * 	Update LserviceMonth205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMonth205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMonth205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceMonth205 with another Field
	 *	@param value
	 */
   public void setLserviceMonth205(Field source) {
       replace(source,0,source.length(),beginLserviceMonth205,LSERVICE_MONTH_205_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceMonth205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMonth205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceMonth205,LSERVICE_MONTH_205_LEN);
   	
   }
   
     /**
	 * 	Update LserviceMonth205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMonth205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMonth205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceCentury205
	 *	@return lserviceCentury205
	 */
   public char[] getLserviceCentury205() throws CFException{
     if (isLserviceCentury205Modified()) { 
        lserviceCentury205 = refreshLserviceCentury205();
     }
   		return lserviceCentury205;
   }

  
	/**
	*  set variable lserviceCentury205
	*  Corresponding COBOL Variable is 205-LSERVICE-CENTURY
	*  @param value
	**/
   public void setLserviceCentury205(char[] value) {
      lserviceCentury205 = checkLserviceCentury205Constraints(value);
      serializeLserviceCentury205(lserviceCentury205);
   } 

     /**
	 * 	Update LserviceCentury205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceCentury205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceCentury205,lserviceCentury205.length);
   	
   }
   
   public void setLserviceCentury205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceCentury205,lserviceCentury205.length);
   	
   }
   
     /**
	 * 	Update LserviceCentury205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCentury205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceCentury205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceCentury205 with another Field
	 *	@param value
	 */
   public void setLserviceCentury205(Field source) {
       replace(source,0,source.length(),beginLserviceCentury205,LSERVICE_CENTURY_205_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceCentury205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceCentury205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceCentury205,LSERVICE_CENTURY_205_LEN);
   	
   }
   
     /**
	 * 	Update LserviceCentury205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCentury205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceCentury205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceYear205
	 *	@return lserviceYear205
	 */
   public char[] getLserviceYear205() throws CFException{
     if (isLserviceYear205Modified()) { 
        lserviceYear205 = refreshLserviceYear205();
     }
   		return lserviceYear205;
   }

  
	/**
	*  set variable lserviceYear205
	*  Corresponding COBOL Variable is 205-LSERVICE-YEAR
	*  @param value
	**/
   public void setLserviceYear205(char[] value) {
      lserviceYear205 = checkLserviceYear205Constraints(value);
      serializeLserviceYear205(lserviceYear205);
   } 

     /**
	 * 	Update LserviceYear205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceYear205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceYear205,lserviceYear205.length);
   	
   }
   
   public void setLserviceYear205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceYear205,lserviceYear205.length);
   	
   }
   
     /**
	 * 	Update LserviceYear205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYear205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceYear205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceYear205 with another Field
	 *	@param value
	 */
   public void setLserviceYear205(Field source) {
       replace(source,0,source.length(),beginLserviceYear205,LSERVICE_YEAR_205_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceYear205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceYear205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceYear205,LSERVICE_YEAR_205_LEN);
   	
   }
   
     /**
	 * 	Update LserviceYear205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYear205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceYear205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceHh205
	 *	@return lserviceHh205
	 */
   public char[] getLserviceHh205() throws CFException{
     if (isLserviceHh205Modified()) { 
        lserviceHh205 = refreshLserviceHh205();
     }
   		return lserviceHh205;
   }

  
	/**
	*  set variable lserviceHh205
	*  Corresponding COBOL Variable is 205-LSERVICE-HH
	*  @param value
	**/
   public void setLserviceHh205(char[] value) {
      lserviceHh205 = checkLserviceHh205Constraints(value);
      serializeLserviceHh205(lserviceHh205);
   } 

     /**
	 * 	Update LserviceHh205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceHh205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceHh205,lserviceHh205.length);
   	
   }
   
   public void setLserviceHh205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceHh205,lserviceHh205.length);
   	
   }
   
     /**
	 * 	Update LserviceHh205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceHh205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceHh205 with another Field
	 *	@param value
	 */
   public void setLserviceHh205(Field source) {
       replace(source,0,source.length(),beginLserviceHh205,LSERVICE_HH_205_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceHh205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceHh205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceHh205,LSERVICE_HH_205_LEN);
   	
   }
   
     /**
	 * 	Update LserviceHh205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceHh205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceMins205
	 *	@return lserviceMins205
	 */
   public char[] getLserviceMins205() throws CFException{
     if (isLserviceMins205Modified()) { 
        lserviceMins205 = refreshLserviceMins205();
     }
   		return lserviceMins205;
   }

  
	/**
	*  set variable lserviceMins205
	*  Corresponding COBOL Variable is 205-LSERVICE-MINS
	*  @param value
	**/
   public void setLserviceMins205(char[] value) {
      lserviceMins205 = checkLserviceMins205Constraints(value);
      serializeLserviceMins205(lserviceMins205);
   } 

     /**
	 * 	Update LserviceMins205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMins205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceMins205,lserviceMins205.length);
   	
   }
   
   public void setLserviceMins205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMins205,lserviceMins205.length);
   	
   }
   
     /**
	 * 	Update LserviceMins205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMins205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceMins205 with another Field
	 *	@param value
	 */
   public void setLserviceMins205(Field source) {
       replace(source,0,source.length(),beginLserviceMins205,LSERVICE_MINS_205_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceMins205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMins205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceMins205,LSERVICE_MINS_205_LEN);
   	
   }
   
     /**
	 * 	Update LserviceMins205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMins205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceSec205
	 *	@return lserviceSec205
	 */
   public char[] getLserviceSec205() throws CFException{
     if (isLserviceSec205Modified()) { 
        lserviceSec205 = refreshLserviceSec205();
     }
   		return lserviceSec205;
   }

  
	/**
	*  set variable lserviceSec205
	*  Corresponding COBOL Variable is 205-LSERVICE-SEC
	*  @param value
	**/
   public void setLserviceSec205(char[] value) {
      lserviceSec205 = checkLserviceSec205Constraints(value);
      serializeLserviceSec205(lserviceSec205);
   } 

     /**
	 * 	Update LserviceSec205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceSec205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceSec205,lserviceSec205.length);
   	
   }
   
   public void setLserviceSec205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceSec205,lserviceSec205.length);
   	
   }
   
     /**
	 * 	Update LserviceSec205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceSec205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceSec205 with another Field
	 *	@param value
	 */
   public void setLserviceSec205(Field source) {
       replace(source,0,source.length(),beginLserviceSec205,LSERVICE_SEC_205_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceSec205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceSec205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceSec205,LSERVICE_SEC_205_LEN);
   	
   }
   
     /**
	 * 	Update LserviceSec205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceSec205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceDate205
	 *	@return hserviceDate205
	 */
   public char[] getHserviceDate205() throws CFException{
     if (isHserviceDate205Modified()) { 
        hserviceDate205 = refreshHserviceDate205();
     }
   		return hserviceDate205;
   }

  
	/**
	*  set variable hserviceDate205
	*  Corresponding COBOL Variable is 205-HSERVICE-DATE
	*  @param value
	**/
   public void setHserviceDate205(char[] value) {
      hserviceDate205 = checkHserviceDate205Constraints(value);
      serializeHserviceDate205(hserviceDate205);
   } 

     /**
	 * 	Update HserviceDate205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceDate205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceDate205,hserviceDate205.length);
   	
   }
   
   public void setHserviceDate205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceDate205,hserviceDate205.length);
   	
   }
   
     /**
	 * 	Update HserviceDate205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDate205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceDate205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceDate205 with another Field
	 *	@param value
	 */
   public void setHserviceDate205(Field source) {
       replace(source,0,source.length(),beginHserviceDate205,HSERVICE_DATE_205_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceDate205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceDate205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceDate205,HSERVICE_DATE_205_LEN);
   	
   }
   
     /**
	 * 	Update HserviceDate205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDate205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceDate205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceMonth205
	 *	@return hserviceMonth205
	 */
   public char[] getHserviceMonth205() throws CFException{
     if (isHserviceMonth205Modified()) { 
        hserviceMonth205 = refreshHserviceMonth205();
     }
   		return hserviceMonth205;
   }

  
	/**
	*  set variable hserviceMonth205
	*  Corresponding COBOL Variable is 205-HSERVICE-MONTH
	*  @param value
	**/
   public void setHserviceMonth205(char[] value) {
      hserviceMonth205 = checkHserviceMonth205Constraints(value);
      serializeHserviceMonth205(hserviceMonth205);
   } 

     /**
	 * 	Update HserviceMonth205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMonth205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceMonth205,hserviceMonth205.length);
   	
   }
   
   public void setHserviceMonth205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMonth205,hserviceMonth205.length);
   	
   }
   
     /**
	 * 	Update HserviceMonth205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMonth205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMonth205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceMonth205 with another Field
	 *	@param value
	 */
   public void setHserviceMonth205(Field source) {
       replace(source,0,source.length(),beginHserviceMonth205,HSERVICE_MONTH_205_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceMonth205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMonth205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceMonth205,HSERVICE_MONTH_205_LEN);
   	
   }
   
     /**
	 * 	Update HserviceMonth205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMonth205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMonth205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceCentury205
	 *	@return hserviceCentury205
	 */
   public char[] getHserviceCentury205() throws CFException{
     if (isHserviceCentury205Modified()) { 
        hserviceCentury205 = refreshHserviceCentury205();
     }
   		return hserviceCentury205;
   }

  
	/**
	*  set variable hserviceCentury205
	*  Corresponding COBOL Variable is 205-HSERVICE-CENTURY
	*  @param value
	**/
   public void setHserviceCentury205(char[] value) {
      hserviceCentury205 = checkHserviceCentury205Constraints(value);
      serializeHserviceCentury205(hserviceCentury205);
   } 

     /**
	 * 	Update HserviceCentury205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceCentury205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceCentury205,hserviceCentury205.length);
   	
   }
   
   public void setHserviceCentury205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceCentury205,hserviceCentury205.length);
   	
   }
   
     /**
	 * 	Update HserviceCentury205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCentury205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceCentury205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceCentury205 with another Field
	 *	@param value
	 */
   public void setHserviceCentury205(Field source) {
       replace(source,0,source.length(),beginHserviceCentury205,HSERVICE_CENTURY_205_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceCentury205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceCentury205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceCentury205,HSERVICE_CENTURY_205_LEN);
   	
   }
   
     /**
	 * 	Update HserviceCentury205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCentury205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceCentury205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceYear205
	 *	@return hserviceYear205
	 */
   public char[] getHserviceYear205() throws CFException{
     if (isHserviceYear205Modified()) { 
        hserviceYear205 = refreshHserviceYear205();
     }
   		return hserviceYear205;
   }

  
	/**
	*  set variable hserviceYear205
	*  Corresponding COBOL Variable is 205-HSERVICE-YEAR
	*  @param value
	**/
   public void setHserviceYear205(char[] value) {
      hserviceYear205 = checkHserviceYear205Constraints(value);
      serializeHserviceYear205(hserviceYear205);
   } 

     /**
	 * 	Update HserviceYear205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceYear205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceYear205,hserviceYear205.length);
   	
   }
   
   public void setHserviceYear205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceYear205,hserviceYear205.length);
   	
   }
   
     /**
	 * 	Update HserviceYear205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYear205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceYear205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceYear205 with another Field
	 *	@param value
	 */
   public void setHserviceYear205(Field source) {
       replace(source,0,source.length(),beginHserviceYear205,HSERVICE_YEAR_205_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceYear205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceYear205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceYear205,HSERVICE_YEAR_205_LEN);
   	
   }
   
     /**
	 * 	Update HserviceYear205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYear205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceYear205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceHh205
	 *	@return hserviceHh205
	 */
   public char[] getHserviceHh205() throws CFException{
     if (isHserviceHh205Modified()) { 
        hserviceHh205 = refreshHserviceHh205();
     }
   		return hserviceHh205;
   }

  
	/**
	*  set variable hserviceHh205
	*  Corresponding COBOL Variable is 205-HSERVICE-HH
	*  @param value
	**/
   public void setHserviceHh205(char[] value) {
      hserviceHh205 = checkHserviceHh205Constraints(value);
      serializeHserviceHh205(hserviceHh205);
   } 

     /**
	 * 	Update HserviceHh205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceHh205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceHh205,hserviceHh205.length);
   	
   }
   
   public void setHserviceHh205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceHh205,hserviceHh205.length);
   	
   }
   
     /**
	 * 	Update HserviceHh205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceHh205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceHh205 with another Field
	 *	@param value
	 */
   public void setHserviceHh205(Field source) {
       replace(source,0,source.length(),beginHserviceHh205,HSERVICE_HH_205_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceHh205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceHh205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceHh205,HSERVICE_HH_205_LEN);
   	
   }
   
     /**
	 * 	Update HserviceHh205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceHh205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceMins205
	 *	@return hserviceMins205
	 */
   public char[] getHserviceMins205() throws CFException{
     if (isHserviceMins205Modified()) { 
        hserviceMins205 = refreshHserviceMins205();
     }
   		return hserviceMins205;
   }

  
	/**
	*  set variable hserviceMins205
	*  Corresponding COBOL Variable is 205-HSERVICE-MINS
	*  @param value
	**/
   public void setHserviceMins205(char[] value) {
      hserviceMins205 = checkHserviceMins205Constraints(value);
      serializeHserviceMins205(hserviceMins205);
   } 

     /**
	 * 	Update HserviceMins205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMins205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceMins205,hserviceMins205.length);
   	
   }
   
   public void setHserviceMins205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMins205,hserviceMins205.length);
   	
   }
   
     /**
	 * 	Update HserviceMins205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMins205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceMins205 with another Field
	 *	@param value
	 */
   public void setHserviceMins205(Field source) {
       replace(source,0,source.length(),beginHserviceMins205,HSERVICE_MINS_205_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceMins205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMins205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceMins205,HSERVICE_MINS_205_LEN);
   	
   }
   
     /**
	 * 	Update HserviceMins205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMins205+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceSec205
	 *	@return hserviceSec205
	 */
   public char[] getHserviceSec205() throws CFException{
     if (isHserviceSec205Modified()) { 
        hserviceSec205 = refreshHserviceSec205();
     }
   		return hserviceSec205;
   }

  
	/**
	*  set variable hserviceSec205
	*  Corresponding COBOL Variable is 205-HSERVICE-SEC
	*  @param value
	**/
   public void setHserviceSec205(char[] value) {
      hserviceSec205 = checkHserviceSec205Constraints(value);
      serializeHserviceSec205(hserviceSec205);
   } 

     /**
	 * 	Update HserviceSec205 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceSec205(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceSec205,hserviceSec205.length);
   	
   }
   
   public void setHserviceSec205(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceSec205,hserviceSec205.length);
   	
   }
   
     /**
	 * 	Update HserviceSec205 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceSec205+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceSec205 with another Field
	 *	@param value
	 */
   public void setHserviceSec205(Field source) {
       replace(source,0,source.length(),beginHserviceSec205,HSERVICE_SEC_205_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceSec205 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceSec205(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceSec205,HSERVICE_SEC_205_LEN);
   	
   }
   
     /**
	 * 	Update HserviceSec205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceSec205+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDetail1205FieldLength() {
			return DETAIL_1205_LENGTH;
		}

}
  
