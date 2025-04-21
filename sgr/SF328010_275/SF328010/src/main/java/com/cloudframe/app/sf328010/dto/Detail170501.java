package com.cloudframe.app.sf328010.dto;

/**
*  The class Detail170501 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:58. using version 5.0.0.256
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Detail170501 extends Detail170501Serialized { 
   



						private char[] lserviceDate705 = new char[2];


						private char[] lserviceMonth705 = new char[3];


						private char[] lserviceCentury705 = new char[2];

						private char[] lserviceYear705 = new char[2];


						private char[] lserviceHh705 = new char[2];


						private char[] lserviceMins705 = new char[2];


						private char[] lserviceSec705 = new char[2];




						private char[] hserviceDate705 = new char[2];


						private char[] hserviceMonth705 = new char[3];


						private char[] hserviceCentury705 = new char[2];

						private char[] hserviceYear705 = new char[2];


						private char[] hserviceHh705 = new char[2];


						private char[] hserviceMins705 = new char[2];


						private char[] hserviceSec705 = new char[2];

	
	/**
	* Constructor for Detail170501
	**/
    public Detail170501() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for Detail170501. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Detail170501(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
       replaceValue( // serialize and save the value
             ("REPORT ACTIVITY DATE RANGE:").toCharArray()
             , getStartOffset() + 0
             ,27
             );
       replaceValue( // serialize and save the value
             fillSpace(2)
             , getStartOffset() + 27
             ,2
             );
								setLserviceDate705(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 31
             ,1
             );
								setLserviceMonth705(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 35
             ,1
             );
								setLserviceCentury705(fillSpace(2));
								setLserviceYear705(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 40
             ,1
             );
								setLserviceHh705(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 43
             ,1
             );
								setLserviceMins705(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 46
             ,1
             );
								setLserviceSec705(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 49
             ,1
             );
       replaceValue( // serialize and save the value
             ("TO").toCharArray()
             , getStartOffset() + 50
             ,2
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 52
             ,1
             );
								setHserviceDate705(fillSpace(2));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 55
             ,1
             );
								setHserviceMonth705(fillSpace(3));
       replaceValue( // serialize and save the value
             ("-").toCharArray()
             , getStartOffset() + 59
             ,1
             );
								setHserviceCentury705(fillSpace(2));
								setHserviceYear705(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 64
             ,1
             );
								setHserviceHh705(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 67
             ,1
             );
								setHserviceMins705(fillSpace(2));
       replaceValue( // serialize and save the value
             (":").toCharArray()
             , getStartOffset() + 70
             ,1
             );
								setHserviceSec705(fillSpace(2));
       replaceValue( // serialize and save the value
             fillSpace(59)
             , getStartOffset() + 73
             ,59
             );
    } 

	/**
	 *	Returns the value of lserviceDate705
	 *	@return lserviceDate705
	 */
   public char[] getLserviceDate705() throws CFException{
     if (isLserviceDate705Modified()) { 
        lserviceDate705 = refreshLserviceDate705();
     }
   		return lserviceDate705;
   }

  
	/**
	*  set variable lserviceDate705
	*  Corresponding COBOL Variable is 705-LSERVICE-DATE
	*  @param value
	**/
   public void setLserviceDate705(char[] value) {
      lserviceDate705 = checkLserviceDate705Constraints(value);
      serializeLserviceDate705(lserviceDate705);
   } 

     /**
	 * 	Update LserviceDate705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceDate705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceDate705,lserviceDate705.length);
   	
   }
   
   public void setLserviceDate705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceDate705,lserviceDate705.length);
   	
   }
   
     /**
	 * 	Update LserviceDate705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDate705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceDate705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceDate705 with another Field
	 *	@param value
	 */
   public void setLserviceDate705(Field source) {
       replace(source,0,source.length(),beginLserviceDate705,LSERVICE_DATE_705_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceDate705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceDate705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceDate705,LSERVICE_DATE_705_LEN);
   	
   }
   
     /**
	 * 	Update LserviceDate705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceDate705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceDate705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceMonth705
	 *	@return lserviceMonth705
	 */
   public char[] getLserviceMonth705() throws CFException{
     if (isLserviceMonth705Modified()) { 
        lserviceMonth705 = refreshLserviceMonth705();
     }
   		return lserviceMonth705;
   }

  
	/**
	*  set variable lserviceMonth705
	*  Corresponding COBOL Variable is 705-LSERVICE-MONTH
	*  @param value
	**/
   public void setLserviceMonth705(char[] value) {
      lserviceMonth705 = checkLserviceMonth705Constraints(value);
      serializeLserviceMonth705(lserviceMonth705);
   } 

     /**
	 * 	Update LserviceMonth705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMonth705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceMonth705,lserviceMonth705.length);
   	
   }
   
   public void setLserviceMonth705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMonth705,lserviceMonth705.length);
   	
   }
   
     /**
	 * 	Update LserviceMonth705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMonth705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMonth705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceMonth705 with another Field
	 *	@param value
	 */
   public void setLserviceMonth705(Field source) {
       replace(source,0,source.length(),beginLserviceMonth705,LSERVICE_MONTH_705_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceMonth705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMonth705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceMonth705,LSERVICE_MONTH_705_LEN);
   	
   }
   
     /**
	 * 	Update LserviceMonth705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMonth705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMonth705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceCentury705
	 *	@return lserviceCentury705
	 */
   public char[] getLserviceCentury705() throws CFException{
     if (isLserviceCentury705Modified()) { 
        lserviceCentury705 = refreshLserviceCentury705();
     }
   		return lserviceCentury705;
   }

  
	/**
	*  set variable lserviceCentury705
	*  Corresponding COBOL Variable is 705-LSERVICE-CENTURY
	*  @param value
	**/
   public void setLserviceCentury705(char[] value) {
      lserviceCentury705 = checkLserviceCentury705Constraints(value);
      serializeLserviceCentury705(lserviceCentury705);
   } 

     /**
	 * 	Update LserviceCentury705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceCentury705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceCentury705,lserviceCentury705.length);
   	
   }
   
   public void setLserviceCentury705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceCentury705,lserviceCentury705.length);
   	
   }
   
     /**
	 * 	Update LserviceCentury705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCentury705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceCentury705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceCentury705 with another Field
	 *	@param value
	 */
   public void setLserviceCentury705(Field source) {
       replace(source,0,source.length(),beginLserviceCentury705,LSERVICE_CENTURY_705_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceCentury705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceCentury705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceCentury705,LSERVICE_CENTURY_705_LEN);
   	
   }
   
     /**
	 * 	Update LserviceCentury705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceCentury705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceCentury705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceYear705
	 *	@return lserviceYear705
	 */
   public char[] getLserviceYear705() throws CFException{
     if (isLserviceYear705Modified()) { 
        lserviceYear705 = refreshLserviceYear705();
     }
   		return lserviceYear705;
   }

  
	/**
	*  set variable lserviceYear705
	*  Corresponding COBOL Variable is 705-LSERVICE-YEAR
	*  @param value
	**/
   public void setLserviceYear705(char[] value) {
      lserviceYear705 = checkLserviceYear705Constraints(value);
      serializeLserviceYear705(lserviceYear705);
   } 

     /**
	 * 	Update LserviceYear705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceYear705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceYear705,lserviceYear705.length);
   	
   }
   
   public void setLserviceYear705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceYear705,lserviceYear705.length);
   	
   }
   
     /**
	 * 	Update LserviceYear705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYear705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceYear705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceYear705 with another Field
	 *	@param value
	 */
   public void setLserviceYear705(Field source) {
       replace(source,0,source.length(),beginLserviceYear705,LSERVICE_YEAR_705_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceYear705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceYear705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceYear705,LSERVICE_YEAR_705_LEN);
   	
   }
   
     /**
	 * 	Update LserviceYear705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceYear705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceYear705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceHh705
	 *	@return lserviceHh705
	 */
   public char[] getLserviceHh705() throws CFException{
     if (isLserviceHh705Modified()) { 
        lserviceHh705 = refreshLserviceHh705();
     }
   		return lserviceHh705;
   }

  
	/**
	*  set variable lserviceHh705
	*  Corresponding COBOL Variable is 705-LSERVICE-HH
	*  @param value
	**/
   public void setLserviceHh705(char[] value) {
      lserviceHh705 = checkLserviceHh705Constraints(value);
      serializeLserviceHh705(lserviceHh705);
   } 

     /**
	 * 	Update LserviceHh705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceHh705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceHh705,lserviceHh705.length);
   	
   }
   
   public void setLserviceHh705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceHh705,lserviceHh705.length);
   	
   }
   
     /**
	 * 	Update LserviceHh705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceHh705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceHh705 with another Field
	 *	@param value
	 */
   public void setLserviceHh705(Field source) {
       replace(source,0,source.length(),beginLserviceHh705,LSERVICE_HH_705_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceHh705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceHh705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceHh705,LSERVICE_HH_705_LEN);
   	
   }
   
     /**
	 * 	Update LserviceHh705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceHh705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceHh705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceMins705
	 *	@return lserviceMins705
	 */
   public char[] getLserviceMins705() throws CFException{
     if (isLserviceMins705Modified()) { 
        lserviceMins705 = refreshLserviceMins705();
     }
   		return lserviceMins705;
   }

  
	/**
	*  set variable lserviceMins705
	*  Corresponding COBOL Variable is 705-LSERVICE-MINS
	*  @param value
	**/
   public void setLserviceMins705(char[] value) {
      lserviceMins705 = checkLserviceMins705Constraints(value);
      serializeLserviceMins705(lserviceMins705);
   } 

     /**
	 * 	Update LserviceMins705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceMins705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceMins705,lserviceMins705.length);
   	
   }
   
   public void setLserviceMins705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMins705,lserviceMins705.length);
   	
   }
   
     /**
	 * 	Update LserviceMins705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMins705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceMins705 with another Field
	 *	@param value
	 */
   public void setLserviceMins705(Field source) {
       replace(source,0,source.length(),beginLserviceMins705,LSERVICE_MINS_705_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceMins705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceMins705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceMins705,LSERVICE_MINS_705_LEN);
   	
   }
   
     /**
	 * 	Update LserviceMins705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceMins705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceMins705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of lserviceSec705
	 *	@return lserviceSec705
	 */
   public char[] getLserviceSec705() throws CFException{
     if (isLserviceSec705Modified()) { 
        lserviceSec705 = refreshLserviceSec705();
     }
   		return lserviceSec705;
   }

  
	/**
	*  set variable lserviceSec705
	*  Corresponding COBOL Variable is 705-LSERVICE-SEC
	*  @param value
	**/
   public void setLserviceSec705(char[] value) {
      lserviceSec705 = checkLserviceSec705Constraints(value);
      serializeLserviceSec705(lserviceSec705);
   } 

     /**
	 * 	Update LserviceSec705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setLserviceSec705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginLserviceSec705,lserviceSec705.length);
   	
   }
   
   public void setLserviceSec705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceSec705,lserviceSec705.length);
   	
   }
   
     /**
	 * 	Update LserviceSec705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceSec705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update LserviceSec705 with another Field
	 *	@param value
	 */
   public void setLserviceSec705(Field source) {
       replace(source,0,source.length(),beginLserviceSec705,LSERVICE_SEC_705_LEN);
   	
   }  
   
     /**
	 * 	Update LserviceSec705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setLserviceSec705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginLserviceSec705,LSERVICE_SEC_705_LEN);
   	
   }
   
     /**
	 * 	Update LserviceSec705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setLserviceSec705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginLserviceSec705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceDate705
	 *	@return hserviceDate705
	 */
   public char[] getHserviceDate705() throws CFException{
     if (isHserviceDate705Modified()) { 
        hserviceDate705 = refreshHserviceDate705();
     }
   		return hserviceDate705;
   }

  
	/**
	*  set variable hserviceDate705
	*  Corresponding COBOL Variable is 705-HSERVICE-DATE
	*  @param value
	**/
   public void setHserviceDate705(char[] value) {
      hserviceDate705 = checkHserviceDate705Constraints(value);
      serializeHserviceDate705(hserviceDate705);
   } 

     /**
	 * 	Update HserviceDate705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceDate705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceDate705,hserviceDate705.length);
   	
   }
   
   public void setHserviceDate705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceDate705,hserviceDate705.length);
   	
   }
   
     /**
	 * 	Update HserviceDate705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDate705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceDate705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceDate705 with another Field
	 *	@param value
	 */
   public void setHserviceDate705(Field source) {
       replace(source,0,source.length(),beginHserviceDate705,HSERVICE_DATE_705_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceDate705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceDate705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceDate705,HSERVICE_DATE_705_LEN);
   	
   }
   
     /**
	 * 	Update HserviceDate705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceDate705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceDate705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceMonth705
	 *	@return hserviceMonth705
	 */
   public char[] getHserviceMonth705() throws CFException{
     if (isHserviceMonth705Modified()) { 
        hserviceMonth705 = refreshHserviceMonth705();
     }
   		return hserviceMonth705;
   }

  
	/**
	*  set variable hserviceMonth705
	*  Corresponding COBOL Variable is 705-HSERVICE-MONTH
	*  @param value
	**/
   public void setHserviceMonth705(char[] value) {
      hserviceMonth705 = checkHserviceMonth705Constraints(value);
      serializeHserviceMonth705(hserviceMonth705);
   } 

     /**
	 * 	Update HserviceMonth705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMonth705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceMonth705,hserviceMonth705.length);
   	
   }
   
   public void setHserviceMonth705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMonth705,hserviceMonth705.length);
   	
   }
   
     /**
	 * 	Update HserviceMonth705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMonth705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMonth705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceMonth705 with another Field
	 *	@param value
	 */
   public void setHserviceMonth705(Field source) {
       replace(source,0,source.length(),beginHserviceMonth705,HSERVICE_MONTH_705_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceMonth705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMonth705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceMonth705,HSERVICE_MONTH_705_LEN);
   	
   }
   
     /**
	 * 	Update HserviceMonth705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMonth705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMonth705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceCentury705
	 *	@return hserviceCentury705
	 */
   public char[] getHserviceCentury705() throws CFException{
     if (isHserviceCentury705Modified()) { 
        hserviceCentury705 = refreshHserviceCentury705();
     }
   		return hserviceCentury705;
   }

  
	/**
	*  set variable hserviceCentury705
	*  Corresponding COBOL Variable is 705-HSERVICE-CENTURY
	*  @param value
	**/
   public void setHserviceCentury705(char[] value) {
      hserviceCentury705 = checkHserviceCentury705Constraints(value);
      serializeHserviceCentury705(hserviceCentury705);
   } 

     /**
	 * 	Update HserviceCentury705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceCentury705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceCentury705,hserviceCentury705.length);
   	
   }
   
   public void setHserviceCentury705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceCentury705,hserviceCentury705.length);
   	
   }
   
     /**
	 * 	Update HserviceCentury705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCentury705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceCentury705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceCentury705 with another Field
	 *	@param value
	 */
   public void setHserviceCentury705(Field source) {
       replace(source,0,source.length(),beginHserviceCentury705,HSERVICE_CENTURY_705_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceCentury705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceCentury705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceCentury705,HSERVICE_CENTURY_705_LEN);
   	
   }
   
     /**
	 * 	Update HserviceCentury705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceCentury705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceCentury705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceYear705
	 *	@return hserviceYear705
	 */
   public char[] getHserviceYear705() throws CFException{
     if (isHserviceYear705Modified()) { 
        hserviceYear705 = refreshHserviceYear705();
     }
   		return hserviceYear705;
   }

  
	/**
	*  set variable hserviceYear705
	*  Corresponding COBOL Variable is 705-HSERVICE-YEAR
	*  @param value
	**/
   public void setHserviceYear705(char[] value) {
      hserviceYear705 = checkHserviceYear705Constraints(value);
      serializeHserviceYear705(hserviceYear705);
   } 

     /**
	 * 	Update HserviceYear705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceYear705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceYear705,hserviceYear705.length);
   	
   }
   
   public void setHserviceYear705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceYear705,hserviceYear705.length);
   	
   }
   
     /**
	 * 	Update HserviceYear705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYear705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceYear705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceYear705 with another Field
	 *	@param value
	 */
   public void setHserviceYear705(Field source) {
       replace(source,0,source.length(),beginHserviceYear705,HSERVICE_YEAR_705_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceYear705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceYear705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceYear705,HSERVICE_YEAR_705_LEN);
   	
   }
   
     /**
	 * 	Update HserviceYear705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceYear705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceYear705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceHh705
	 *	@return hserviceHh705
	 */
   public char[] getHserviceHh705() throws CFException{
     if (isHserviceHh705Modified()) { 
        hserviceHh705 = refreshHserviceHh705();
     }
   		return hserviceHh705;
   }

  
	/**
	*  set variable hserviceHh705
	*  Corresponding COBOL Variable is 705-HSERVICE-HH
	*  @param value
	**/
   public void setHserviceHh705(char[] value) {
      hserviceHh705 = checkHserviceHh705Constraints(value);
      serializeHserviceHh705(hserviceHh705);
   } 

     /**
	 * 	Update HserviceHh705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceHh705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceHh705,hserviceHh705.length);
   	
   }
   
   public void setHserviceHh705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceHh705,hserviceHh705.length);
   	
   }
   
     /**
	 * 	Update HserviceHh705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceHh705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceHh705 with another Field
	 *	@param value
	 */
   public void setHserviceHh705(Field source) {
       replace(source,0,source.length(),beginHserviceHh705,HSERVICE_HH_705_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceHh705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceHh705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceHh705,HSERVICE_HH_705_LEN);
   	
   }
   
     /**
	 * 	Update HserviceHh705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceHh705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceHh705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceMins705
	 *	@return hserviceMins705
	 */
   public char[] getHserviceMins705() throws CFException{
     if (isHserviceMins705Modified()) { 
        hserviceMins705 = refreshHserviceMins705();
     }
   		return hserviceMins705;
   }

  
	/**
	*  set variable hserviceMins705
	*  Corresponding COBOL Variable is 705-HSERVICE-MINS
	*  @param value
	**/
   public void setHserviceMins705(char[] value) {
      hserviceMins705 = checkHserviceMins705Constraints(value);
      serializeHserviceMins705(hserviceMins705);
   } 

     /**
	 * 	Update HserviceMins705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceMins705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceMins705,hserviceMins705.length);
   	
   }
   
   public void setHserviceMins705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMins705,hserviceMins705.length);
   	
   }
   
     /**
	 * 	Update HserviceMins705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMins705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceMins705 with another Field
	 *	@param value
	 */
   public void setHserviceMins705(Field source) {
       replace(source,0,source.length(),beginHserviceMins705,HSERVICE_MINS_705_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceMins705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceMins705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceMins705,HSERVICE_MINS_705_LEN);
   	
   }
   
     /**
	 * 	Update HserviceMins705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceMins705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceMins705+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hserviceSec705
	 *	@return hserviceSec705
	 */
   public char[] getHserviceSec705() throws CFException{
     if (isHserviceSec705Modified()) { 
        hserviceSec705 = refreshHserviceSec705();
     }
   		return hserviceSec705;
   }

  
	/**
	*  set variable hserviceSec705
	*  Corresponding COBOL Variable is 705-HSERVICE-SEC
	*  @param value
	**/
   public void setHserviceSec705(char[] value) {
      hserviceSec705 = checkHserviceSec705Constraints(value);
      serializeHserviceSec705(hserviceSec705);
   } 

     /**
	 * 	Update HserviceSec705 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHserviceSec705(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHserviceSec705,hserviceSec705.length);
   	
   }
   
   public void setHserviceSec705(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceSec705,hserviceSec705.length);
   	
   }
   
     /**
	 * 	Update HserviceSec705 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceSec705+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update HserviceSec705 with another Field
	 *	@param value
	 */
   public void setHserviceSec705(Field source) {
       replace(source,0,source.length(),beginHserviceSec705,HSERVICE_SEC_705_LEN);
   	
   }  
   
     /**
	 * 	Update HserviceSec705 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHserviceSec705(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHserviceSec705,HSERVICE_SEC_705_LEN);
   	
   }
   
     /**
	 * 	Update HserviceSec705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHserviceSec705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHserviceSec705+targetIndex,targetLen);
    
   }

	
	
	

		public static int getDetail170501FieldLength() {
			return DETAIL_170501_LENGTH;
		}

}
  
