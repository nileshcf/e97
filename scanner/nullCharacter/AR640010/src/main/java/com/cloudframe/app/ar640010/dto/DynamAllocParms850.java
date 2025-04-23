package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamAllocParms850 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DynamAllocParms850 extends DynamAllocParms850Serialized { 
   


						private char[] dynamDd850 = new char[8];


						private char[] dynamDsn850 = new char[44];

						private char[] dynamExtTyp850 = new char[5];

						private char[] dynamExtId850 = new char[8];

							private char[] dynamWorkAreas850ConditionGroup3 = new char[16];
						



						private char[] dynamDcType850 = new char[7];


						private char[] dynamRecfm850 = new char[3];


								private long dynamLrecl850;


								private long dynamBlksz850;
				private DynamAtype850 dynamAtype850 = new DynamAtype850();


								private long dynamSpcPri850;


								private long dynamSpcSec850;

	
	/**
	* Constructor for DynamAllocParms850
	**/
    public DynamAllocParms850() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for DynamAllocParms850. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DynamAllocParms850(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			dynamAtype850.setParent(this,getStartOffset() + 164);
       replaceValue( // serialize and save the value
             ("DD=").toCharArray()
             , getStartOffset() + 0
             ,3
             );
								setDynamDd850(fillSpace(8));
       replaceValue( // serialize and save the value
             (" DSN=").toCharArray()
             , getStartOffset() + 11
             ,5
             );
								setDynamDsn850(fillSpace(44));
								setDynamExtTyp850(fillSpace(5));
								setDynamExtId850(fillSpace(8));
       replaceValue( // serialize and save the value
             fillSpace(16)
             , getStartOffset() + 73
             ,16
             );
       replaceValue( // serialize and save the value
             (" CDELETE").toCharArray()
             , getStartOffset() + 89
             ,8
             );
       replaceValue( // serialize and save the value
             (" TYPE=").toCharArray()
             , getStartOffset() + 97
             ,6
             );
								setDynamDcType850(fillSpace(7));
       replaceValue( // serialize and save the value
             (" UNIT=DISK RECFM=").toCharArray()
             , getStartOffset() + 110
             ,17
             );
								setDynamRecfm850(fillSpace(3));
       replaceValue( // serialize and save the value
             (" LRECL=").toCharArray()
             , getStartOffset() + 130
             ,7
             );
								setDynamLrecl850(0L);
       replaceValue( // serialize and save the value
             (" BLKSIZE=").toCharArray()
             , getStartOffset() + 146
             ,9
             );
								setDynamBlksz850(0L);
								dynamAtype850.setString(fillSpace(16));
       replaceValue( // serialize and save the value
             (" PRIMARY=").toCharArray()
             , getStartOffset() + 180
             ,9
             );
								setDynamSpcPri850(0L);
       replaceValue( // serialize and save the value
             (" SECONDARY=").toCharArray()
             , getStartOffset() + 198
             ,11
             );
								setDynamSpcSec850(0L);
       replaceValue( // serialize and save the value
             (" RLSE;").toCharArray()
             , getStartOffset() + 218
             ,6
             );
    } 

	/**
	 *	Returns the value of dynamDd850
	 *	@return dynamDd850
	 */
   public char[] getDynamDd850() throws CFException{
     if (isDynamDd850Modified()) { 
        dynamDd850 = refreshDynamDd850();
     }
   		return dynamDd850;
   }

  
	/**
	*  set variable dynamDd850
	*  Corresponding COBOL Variable is 850-DYNAM-DD
	*  @param value
	**/
   public void setDynamDd850(char[] value) {
      dynamDd850 = checkDynamDd850Constraints(value);
      serializeDynamDd850(dynamDd850);
   } 

     /**
	 * 	Update DynamDd850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamDd850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamDd850,dynamDd850.length);
   	
   }
   
   public void setDynamDd850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamDd850,dynamDd850.length);
   	
   }
   
     /**
	 * 	Update DynamDd850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamDd850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamDd850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamDd850 with another Field
	 *	@param value
	 */
   public void setDynamDd850(Field source) {
       replace(source,0,source.length(),beginDynamDd850,DYNAM_DD_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamDd850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamDd850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamDd850,DYNAM_DD_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamDd850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamDd850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamDd850+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dynamDsn850
	 *	@return dynamDsn850
	 */
   public char[] getDynamDsn850() throws CFException{
     if (isDynamDsn850Modified()) { 
        dynamDsn850 = refreshDynamDsn850();
     }
   		return dynamDsn850;
   }

  
	/**
	*  set variable dynamDsn850
	*  Corresponding COBOL Variable is 850-DYNAM-DSN
	*  @param value
	**/
   public void setDynamDsn850(char[] value) {
      dynamDsn850 = checkDynamDsn850Constraints(value);
      serializeDynamDsn850(dynamDsn850);
   } 

     /**
	 * 	Update DynamDsn850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamDsn850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamDsn850,dynamDsn850.length);
   	
   }
   
   public void setDynamDsn850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamDsn850,dynamDsn850.length);
   	
   }
   
     /**
	 * 	Update DynamDsn850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamDsn850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamDsn850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamDsn850 with another Field
	 *	@param value
	 */
   public void setDynamDsn850(Field source) {
       replace(source,0,source.length(),beginDynamDsn850,DYNAM_DSN_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamDsn850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamDsn850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamDsn850,DYNAM_DSN_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamDsn850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamDsn850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamDsn850+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dynamExtTyp850
	 *	@return dynamExtTyp850
	 */
   public char[] getDynamExtTyp850() throws CFException{
     if (isDynamExtTyp850Modified()) { 
        dynamExtTyp850 = refreshDynamExtTyp850();
     }
   		return dynamExtTyp850;
   }

  
	/**
	*  set variable dynamExtTyp850
	*  Corresponding COBOL Variable is 850-DYNAM-EXT-TYP
	*  @param value
	**/
   public void setDynamExtTyp850(char[] value) {
      dynamExtTyp850 = checkDynamExtTyp850Constraints(value);
      serializeDynamExtTyp850(dynamExtTyp850);
   } 

     /**
	 * 	Update DynamExtTyp850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamExtTyp850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamExtTyp850,dynamExtTyp850.length);
   	
   }
   
   public void setDynamExtTyp850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamExtTyp850,dynamExtTyp850.length);
   	
   }
   
     /**
	 * 	Update DynamExtTyp850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamExtTyp850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamExtTyp850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamExtTyp850 with another Field
	 *	@param value
	 */
   public void setDynamExtTyp850(Field source) {
       replace(source,0,source.length(),beginDynamExtTyp850,DYNAM_EXT_TYP_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamExtTyp850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamExtTyp850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamExtTyp850,DYNAM_EXT_TYP_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamExtTyp850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamExtTyp850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamExtTyp850+targetIndex,targetLen);
    
   }
	char[] dynamGdgRel8885088Value = " GDG=".toCharArray();
	/**
	 *	Test condition " GDG=" for isDynamGdgRel88850()
	 *	@return  Returns true if isDynamGdgRel88850() is " GDG="
	 */
   public boolean isDynamGdgRel88850() throws CFException {
      return (  compareChars( getDynamExtTyp850() , dynamGdgRel8885088Value)  == 0  );
   }


	/**
	*  set values " GDG="
	*/
   	public void setDynamGdgRel88850True() {  			
    	setDynamExtTyp850( dynamGdgRel8885088Value);
   	}
	char[] dynamPdsMbr8885088Value = " MEM=".toCharArray();
	/**
	 *	Test condition " MEM=" for isDynamPdsMbr88850()
	 *	@return  Returns true if isDynamPdsMbr88850() is " MEM="
	 */
   public boolean isDynamPdsMbr88850() throws CFException {
      return (  compareChars( getDynamExtTyp850() , dynamPdsMbr8885088Value)  == 0  );
   }


	/**
	*  set values " MEM="
	*/
   	public void setDynamPdsMbr88850True() {  			
    	setDynamExtTyp850( dynamPdsMbr8885088Value);
   	}
	/**
	 *	Returns the value of dynamExtId850
	 *	@return dynamExtId850
	 */
   public char[] getDynamExtId850() throws CFException{
     if (isDynamExtId850Modified()) { 
        dynamExtId850 = refreshDynamExtId850();
     }
   		return dynamExtId850;
   }

  
	/**
	*  set variable dynamExtId850
	*  Corresponding COBOL Variable is 850-DYNAM-EXT-ID
	*  @param value
	**/
   public void setDynamExtId850(char[] value) {
      dynamExtId850 = checkDynamExtId850Constraints(value);
      serializeDynamExtId850(dynamExtId850);
   } 

     /**
	 * 	Update DynamExtId850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamExtId850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamExtId850,dynamExtId850.length);
   	
   }
   
   public void setDynamExtId850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamExtId850,dynamExtId850.length);
   	
   }
   
     /**
	 * 	Update DynamExtId850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamExtId850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamExtId850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamExtId850 with another Field
	 *	@param value
	 */
   public void setDynamExtId850(Field source) {
       replace(source,0,source.length(),beginDynamExtId850,DYNAM_EXT_ID_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamExtId850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamExtId850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamExtId850,DYNAM_EXT_ID_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamExtId850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamExtId850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamExtId850+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dynamWorkAreas850ConditionGroup3
	 *	@return dynamWorkAreas850ConditionGroup3
	 */
   public char[] getDynamWorkAreas850ConditionGroup3() throws CFException{
     if (isDynamWorkAreas850ConditionGroup3Modified()) { 
        dynamWorkAreas850ConditionGroup3 = refreshDynamWorkAreas850ConditionGroup3();
     }
   		return dynamWorkAreas850ConditionGroup3;
   }

  
	/**
	*  set variable dynamWorkAreas850ConditionGroup3
	*  Corresponding COBOL Variable is FILLER
	*  @param value
	**/
   public void setDynamWorkAreas850ConditionGroup3(char[] value) {
      dynamWorkAreas850ConditionGroup3 = checkDynamWorkAreas850ConditionGroup3Constraints(value);
      serializeDynamWorkAreas850ConditionGroup3(dynamWorkAreas850ConditionGroup3);
   } 

     /**
	 * 	Update DynamWorkAreas850ConditionGroup3 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamWorkAreas850ConditionGroup3(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamWorkAreas850ConditionGroup3,dynamWorkAreas850ConditionGroup3.length);
   	
   }
   
   public void setDynamWorkAreas850ConditionGroup3(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamWorkAreas850ConditionGroup3,dynamWorkAreas850ConditionGroup3.length);
   	
   }
   
     /**
	 * 	Update DynamWorkAreas850ConditionGroup3 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamWorkAreas850ConditionGroup3(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamWorkAreas850ConditionGroup3+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamWorkAreas850ConditionGroup3 with another Field
	 *	@param value
	 */
   public void setDynamWorkAreas850ConditionGroup3(Field source) {
       replace(source,0,source.length(),beginDynamWorkAreas850ConditionGroup3,DYNAM_WORK_AREAS_850_CONDITION_GROUP_3_LEN);
   	
   }  
   
     /**
	 * 	Update DynamWorkAreas850ConditionGroup3 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamWorkAreas850ConditionGroup3(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamWorkAreas850ConditionGroup3,DYNAM_WORK_AREAS_850_CONDITION_GROUP_3_LEN);
   	
   }
   
     /**
	 * 	Update DynamWorkAreas850ConditionGroup3 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamWorkAreas850ConditionGroup3(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamWorkAreas850ConditionGroup3+targetIndex,targetLen);
    
   }
	char[] dynamNewAppl8885088Value = " NEW CATLG CLOSE".toCharArray();
	/**
	 *	Test condition " NEW CATLG CLOSE" for isDynamNewAppl88850()
	 *	@return  Returns true if isDynamNewAppl88850() is " NEW CATLG CLOSE"
	 */
   public boolean isDynamNewAppl88850() throws CFException {
      return (  compareChars( getDynamWorkAreas850ConditionGroup3() , dynamNewAppl8885088Value)  == 0  );
   }


	/**
	*  set values " NEW CATLG CLOSE"
	*/
   	public void setDynamNewAppl88850True() {  			
    	setDynamWorkAreas850ConditionGroup3( dynamNewAppl8885088Value);
   	}
	char[] dynamNewGft8885088Value = " NEW CATLG      ".toCharArray();
	/**
	 *	Test condition " NEW CATLG      " for isDynamNewGft88850()
	 *	@return  Returns true if isDynamNewGft88850() is " NEW CATLG      "
	 */
   public boolean isDynamNewGft88850() throws CFException {
      return (  compareChars( getDynamWorkAreas850ConditionGroup3() , dynamNewGft8885088Value)  == 0  );
   }


	/**
	*  set values " NEW CATLG      "
	*/
   	public void setDynamNewGft88850True() {  			
    	setDynamWorkAreas850ConditionGroup3( dynamNewGft8885088Value);
   	}
	char[] dynamNewDel8885088Value = " NEW DEL CLOSE; ".toCharArray();
	/**
	 *	Test condition " NEW DEL CLOSE; " for isDynamNewDel88850()
	 *	@return  Returns true if isDynamNewDel88850() is " NEW DEL CLOSE; "
	 */
   public boolean isDynamNewDel88850() throws CFException {
      return (  compareChars( getDynamWorkAreas850ConditionGroup3() , dynamNewDel8885088Value)  == 0  );
   }


	/**
	*  set values " NEW DEL CLOSE; "
	*/
   	public void setDynamNewDel88850True() {  			
    	setDynamWorkAreas850ConditionGroup3( dynamNewDel8885088Value);
   	}
	char[] dynamShr8885088Value = " SHR CLOSE;     ".toCharArray();
	/**
	 *	Test condition " SHR CLOSE;     " for isDynamShr88850()
	 *	@return  Returns true if isDynamShr88850() is " SHR CLOSE;     "
	 */
   public boolean isDynamShr88850() throws CFException {
      return (  compareChars( getDynamWorkAreas850ConditionGroup3() , dynamShr8885088Value)  == 0  );
   }


	/**
	*  set values " SHR CLOSE;     "
	*/
   	public void setDynamShr88850True() {  			
    	setDynamWorkAreas850ConditionGroup3( dynamShr8885088Value);
   	}
	char[] dynamOld8885088Value = " OLD CLOSE;     ".toCharArray();
	/**
	 *	Test condition " OLD CLOSE;     " for isDynamOld88850()
	 *	@return  Returns true if isDynamOld88850() is " OLD CLOSE;     "
	 */
   public boolean isDynamOld88850() throws CFException {
      return (  compareChars( getDynamWorkAreas850ConditionGroup3() , dynamOld8885088Value)  == 0  );
   }


	/**
	*  set values " OLD CLOSE;     "
	*/
   	public void setDynamOld88850True() {  			
    	setDynamWorkAreas850ConditionGroup3( dynamOld8885088Value);
   	}
	char[] dynamOldDelete8885088Value = " OLD DEL CLOSE; ".toCharArray();
	/**
	 *	Test condition " OLD DEL CLOSE; " for isDynamOldDelete88850()
	 *	@return  Returns true if isDynamOldDelete88850() is " OLD DEL CLOSE; "
	 */
   public boolean isDynamOldDelete88850() throws CFException {
      return (  compareChars( getDynamWorkAreas850ConditionGroup3() , dynamOldDelete8885088Value)  == 0  );
   }


	/**
	*  set values " OLD DEL CLOSE; "
	*/
   	public void setDynamOldDelete88850True() {  			
    	setDynamWorkAreas850ConditionGroup3( dynamOldDelete8885088Value);
   	}
	char[] dynamUna8885088Value = " UNA;           ".toCharArray();
	/**
	 *	Test condition " UNA;           " for isDynamUna88850()
	 *	@return  Returns true if isDynamUna88850() is " UNA;           "
	 */
   public boolean isDynamUna88850() throws CFException {
      return (  compareChars( getDynamWorkAreas850ConditionGroup3() , dynamUna8885088Value)  == 0  );
   }


	/**
	*  set values " UNA;           "
	*/
   	public void setDynamUna88850True() {  			
    	setDynamWorkAreas850ConditionGroup3( dynamUna8885088Value);
   	}
	/**
	 *	Returns the value of dynamDcType850
	 *	@return dynamDcType850
	 */
   public char[] getDynamDcType850() throws CFException{
     if (isDynamDcType850Modified()) { 
        dynamDcType850 = refreshDynamDcType850();
     }
   		return dynamDcType850;
   }

  
	/**
	*  set variable dynamDcType850
	*  Corresponding COBOL Variable is 850-DYNAM-DC-TYPE
	*  @param value
	**/
   public void setDynamDcType850(char[] value) {
      dynamDcType850 = checkDynamDcType850Constraints(value);
      serializeDynamDcType850(dynamDcType850);
   } 

     /**
	 * 	Update DynamDcType850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamDcType850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamDcType850,dynamDcType850.length);
   	
   }
   
   public void setDynamDcType850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamDcType850,dynamDcType850.length);
   	
   }
   
     /**
	 * 	Update DynamDcType850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamDcType850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamDcType850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamDcType850 with another Field
	 *	@param value
	 */
   public void setDynamDcType850(Field source) {
       replace(source,0,source.length(),beginDynamDcType850,DYNAM_DC_TYPE_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamDcType850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamDcType850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamDcType850,DYNAM_DC_TYPE_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamDcType850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamDcType850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamDcType850+targetIndex,targetLen);
    
   }
	char[] dynamDcTypeBasic8885088Value = "BASIC  ".toCharArray();
	/**
	 *	Test condition "BASIC  " for isDynamDcTypeBasic88850()
	 *	@return  Returns true if isDynamDcTypeBasic88850() is "BASIC  "
	 */
   public boolean isDynamDcTypeBasic88850() throws CFException {
      return (  compareChars( getDynamDcType850() , dynamDcTypeBasic8885088Value)  == 0  );
   }


	/**
	*  set values "BASIC  "
	*/
   	public void setDynamDcTypeBasic88850True() {  			
    	setDynamDcType850( dynamDcTypeBasic8885088Value);
   	}
	char[] dynamDcTypeLarge8885088Value = "LARGE  ".toCharArray();
	/**
	 *	Test condition "LARGE  " for isDynamDcTypeLarge88850()
	 *	@return  Returns true if isDynamDcTypeLarge88850() is "LARGE  "
	 */
   public boolean isDynamDcTypeLarge88850() throws CFException {
      return (  compareChars( getDynamDcType850() , dynamDcTypeLarge8885088Value)  == 0  );
   }


	/**
	*  set values "LARGE  "
	*/
   	public void setDynamDcTypeLarge88850True() {  			
    	setDynamDcType850( dynamDcTypeLarge8885088Value);
   	}
	/**
	 *	Returns the value of dynamRecfm850
	 *	@return dynamRecfm850
	 */
   public char[] getDynamRecfm850() throws CFException{
     if (isDynamRecfm850Modified()) { 
        dynamRecfm850 = refreshDynamRecfm850();
     }
   		return dynamRecfm850;
   }

  
	/**
	*  set variable dynamRecfm850
	*  Corresponding COBOL Variable is 850-DYNAM-RECFM
	*  @param value
	**/
   public void setDynamRecfm850(char[] value) {
      dynamRecfm850 = checkDynamRecfm850Constraints(value);
      serializeDynamRecfm850(dynamRecfm850);
   } 

     /**
	 * 	Update DynamRecfm850 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setDynamRecfm850(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginDynamRecfm850,dynamRecfm850.length);
   	
   }
   
   public void setDynamRecfm850(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginDynamRecfm850,dynamRecfm850.length);
   	
   }
   
     /**
	 * 	Update DynamRecfm850 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamRecfm850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamRecfm850+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update DynamRecfm850 with another Field
	 *	@param value
	 */
   public void setDynamRecfm850(Field source) {
       replace(source,0,source.length(),beginDynamRecfm850,DYNAM_RECFM_850_LEN);
   	
   }  
   
     /**
	 * 	Update DynamRecfm850 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setDynamRecfm850(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginDynamRecfm850,DYNAM_RECFM_850_LEN);
   	
   }
   
     /**
	 * 	Update DynamRecfm850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamRecfm850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginDynamRecfm850+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of dynamLrecl850
	 *	@return dynamLrecl850
	 */
	public long getDynamLrecl850() throws CFException {
       if (isDynamLrecl850Modified()) { 
           dynamLrecl850 = refreshDynamLrecl850();
        }
   		return dynamLrecl850;
	}
	

	
	   
	/**
	 * 	Update DynamLrecl850 with the passed value
	 *  Corresponding COBOL Variable is 850-DYNAM-LRECL
	 *	@param number
	 */
	public void setDynamLrecl850(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dynamLrecl850 = checkDynamLrecl850MaxLimit(number); 
		serializeDynamLrecl850(dynamLrecl850);
	}
	

	/**
	 * 	Update DynamLrecl850 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDynamLrecl850(char[] value) throws CFException {
		 dynamLrecl850 = serializeDynamLrecl850(value);
	}
	/**
	 * 	Update DynamLrecl850 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDynamLrecl850String(char[] value) throws CFException {
		 setDynamLrecl850(value);
	}
	/**
	 *	Returns the value of dynamBlksz850
	 *	@return dynamBlksz850
	 */
	public long getDynamBlksz850() throws CFException {
       if (isDynamBlksz850Modified()) { 
           dynamBlksz850 = refreshDynamBlksz850();
        }
   		return dynamBlksz850;
	}
	

	
	   
	/**
	 * 	Update DynamBlksz850 with the passed value
	 *  Corresponding COBOL Variable is 850-DYNAM-BLKSZ
	 *	@param number
	 */
	public void setDynamBlksz850(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dynamBlksz850 = checkDynamBlksz850MaxLimit(number); 
		serializeDynamBlksz850(dynamBlksz850);
	}
	

	/**
	 * 	Update DynamBlksz850 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDynamBlksz850(char[] value) throws CFException {
		 dynamBlksz850 = serializeDynamBlksz850(value);
	}
	/**
	 * 	Update DynamBlksz850 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDynamBlksz850String(char[] value) throws CFException {
		 setDynamBlksz850(value);
	}
	/**
	 *	Returns the value of dynamAtype850
	 *	@return dynamAtype850
	 */   
	 public DynamAtype850 getDynamAtype850() {
   	return dynamAtype850;
   }
   /**
	* 	Update DynamAtype850 with the passed value
	*   Corresponding COBOL Variable is 850-DYNAM-ATYPE
	*	@param value
	*/
   public void setDynamAtype850(char[] value) {
      dynamAtype850.setString(value); 
   }   
    
     /**
	 * 	Update DynamAtype850 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDynamAtype850(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dynamAtype850.begin,dynamAtype850.length());
   }
   
     /**
	 * 	Update DynamAtype850 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamAtype850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dynamAtype850.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DynamAtype850 with another Field
	 *	@param value
	 */
   public void setDynamAtype850(Field source) {
   	replace(source,0,source.length(),dynamAtype850.begin,dynamAtype850.length());
   }  
   
     /**
	 * 	Update DynamAtype850 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDynamAtype850(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dynamAtype850.begin,dynamAtype850.length());
   }
   
     /**
	 * 	Update DynamAtype850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamAtype850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dynamAtype850.begin+targetIndex,targetLen);
   }
	char[] dynamAtypeCyl8885088Value = " CYL            ".toCharArray();
	/**
	 *	Test condition " CYL            " for isDynamAtypeCyl88850()
	 *	@return  Returns true if isDynamAtypeCyl88850() is " CYL            "
	 */
   public boolean isDynamAtypeCyl88850() throws CFException {
      return (  compareChars( getDynamAtype850().toCharArray() , dynamAtypeCyl8885088Value)  == 0  );
   }


	/**
	*  set values " CYL            "
	*/
   	public void setDynamAtypeCyl88850True() {  			
    	setString(dynamAtypeCyl8885088Value);
   	}
	char[] dynamAtypeTrk8885088Value = " TRK            ".toCharArray();
	/**
	 *	Test condition " TRK            " for isDynamAtypeTrk88850()
	 *	@return  Returns true if isDynamAtypeTrk88850() is " TRK            "
	 */
   public boolean isDynamAtypeTrk88850() throws CFException {
      return (  compareChars( getDynamAtype850().toCharArray() , dynamAtypeTrk8885088Value)  == 0  );
   }


	/**
	*  set values " TRK            "
	*/
   	public void setDynamAtypeTrk88850True() {  			
    	setString(dynamAtypeTrk8885088Value);
   	}
	char[] dynamAtypeBlk8885088Value = " BLOCK=000000000".toCharArray();
	/**
	 *	Test condition " BLOCK=000000000" for isDynamAtypeBlk88850()
	 *	@return  Returns true if isDynamAtypeBlk88850() is " BLOCK=000000000"
	 */
   public boolean isDynamAtypeBlk88850() throws CFException {
      return (  compareChars( getDynamAtype850().toCharArray() , dynamAtypeBlk8885088Value)  == 0  );
   }


	/**
	*  set values " BLOCK=000000000"
	*/
   	public void setDynamAtypeBlk88850True() {  			
    	setString(dynamAtypeBlk8885088Value);
   	}
	/**
	 *	Returns the value of dynamSpcPri850
	 *	@return dynamSpcPri850
	 */
	public long getDynamSpcPri850() throws CFException {
       if (isDynamSpcPri850Modified()) { 
           dynamSpcPri850 = refreshDynamSpcPri850();
        }
   		return dynamSpcPri850;
	}
	

	
	   
	/**
	 * 	Update DynamSpcPri850 with the passed value
	 *  Corresponding COBOL Variable is 850-DYNAM-SPC-PRI
	 *	@param number
	 */
	public void setDynamSpcPri850(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dynamSpcPri850 = checkDynamSpcPri850MaxLimit(number); 
		serializeDynamSpcPri850(dynamSpcPri850);
	}
	

	/**
	 * 	Update DynamSpcPri850 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDynamSpcPri850(char[] value) throws CFException {
		 dynamSpcPri850 = serializeDynamSpcPri850(value);
	}
	/**
	 * 	Update DynamSpcPri850 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDynamSpcPri850String(char[] value) throws CFException {
		 setDynamSpcPri850(value);
	}
	/**
	 *	Returns the value of dynamSpcSec850
	 *	@return dynamSpcSec850
	 */
	public long getDynamSpcSec850() throws CFException {
       if (isDynamSpcSec850Modified()) { 
           dynamSpcSec850 = refreshDynamSpcSec850();
        }
   		return dynamSpcSec850;
	}
	

	
	   
	/**
	 * 	Update DynamSpcSec850 with the passed value
	 *  Corresponding COBOL Variable is 850-DYNAM-SPC-SEC
	 *	@param number
	 */
	public void setDynamSpcSec850(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    dynamSpcSec850 = checkDynamSpcSec850MaxLimit(number); 
		serializeDynamSpcSec850(dynamSpcSec850);
	}
	

	/**
	 * 	Update DynamSpcSec850 with the passed value
	 *	@param value (String or char[])
	 */
	public void setDynamSpcSec850(char[] value) throws CFException {
		 dynamSpcSec850 = serializeDynamSpcSec850(value);
	}
	/**
	 * 	Update DynamSpcSec850 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setDynamSpcSec850String(char[] value) throws CFException {
		 setDynamSpcSec850(value);
	}

	
	
	

		public static int getDynamAllocParms850FieldLength() {
			return DYNAM_ALLOC_PARMS_850_LENGTH;
		}

}
  
