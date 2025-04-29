package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln4 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdPage1Ln4 extends HdPage1Ln4Serialized {
   

						private char[] hd14Cc = new char[1];




						private char[] hd14InstId = new char[10];


						private char[] hd14InstDesc = new char[25];


						private char[] hd14BinNumber = new char[12];


						private char[] hd14BinId = new char[11];

	
	/**
	* Constructor for HdPage1Ln4
	**/
    public HdPage1Ln4() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd14Cc(fillSpace(1));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             ("INSTITUTION ID     :").toCharArray()
             , getStartOffset() + 2
             ,20
             );
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 22
             ,1
             );
								setHd14InstId(fillSpace(10));
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 33
             ,1
             );
								setHd14InstDesc(fillSpace(25));
       replaceValue( // serialize and save the value
             fillSpace(3)
             , getStartOffset() + 59
             ,3
             );
								setHd14BinNumber(("BIN NUMBER :").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 74
             ,1
             );
								setHd14BinId(fillSpace(11));
       replaceValue( // serialize and save the value
             fillSpace(18)
             , getStartOffset() + 86
             ,18
             );
    }


 

	/**
	 *	Returns the value of hd14Cc
	 *	@return hd14Cc
	 */
   public char[] getHd14Cc() throws CFException{
     if (isHd14CcModified()) { 
        hd14Cc = refreshHd14Cc();
     }
   		return hd14Cc;
   }

  
	/**
	*  set variable hd14Cc
	*  Corresponding COBOL Variable is HD1-4-CC
	*  @param value
	**/
   public void setHd14Cc(char[] value) {
      hd14Cc = checkHd14CcConstraints(value);
      serializeHd14Cc(hd14Cc);
   } 

     /**
	 * 	Update Hd14Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd14Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd14Cc,hd14Cc.length);
   	
   }
   
   public void setHd14Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd14Cc,hd14Cc.length);
   	
   }
   
     /**
	 * 	Update Hd14Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd14Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd14Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd14Cc with another Field
	 *	@param value
	 */
   public void setHd14Cc(Field source) {
       replace(source,0,source.length(),beginHd14Cc,HD_14_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd14Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd14Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd14Cc,HD_14_CC_LEN);
   	
   }
   
     /**
	 * 	Update Hd14Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd14Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd14Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd14InstId
	 *	@return hd14InstId
	 */
   public char[] getHd14InstId() throws CFException{
     if (isHd14InstIdModified()) { 
        hd14InstId = refreshHd14InstId();
     }
   		return hd14InstId;
   }

  
	/**
	*  set variable hd14InstId
	*  Corresponding COBOL Variable is HD1-4-INST-ID
	*  @param value
	**/
   public void setHd14InstId(char[] value) {
      hd14InstId = checkHd14InstIdConstraints(value);
      serializeHd14InstId(hd14InstId);
   } 

     /**
	 * 	Update Hd14InstId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd14InstId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd14InstId,hd14InstId.length);
   	
   }
   
   public void setHd14InstId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd14InstId,hd14InstId.length);
   	
   }
   
     /**
	 * 	Update Hd14InstId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd14InstId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd14InstId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd14InstId with another Field
	 *	@param value
	 */
   public void setHd14InstId(Field source) {
       replace(source,0,source.length(),beginHd14InstId,HD_14_INST_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Hd14InstId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd14InstId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd14InstId,HD_14_INST_ID_LEN);
   	
   }
   
     /**
	 * 	Update Hd14InstId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd14InstId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd14InstId+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd14InstDesc
	 *	@return hd14InstDesc
	 */
   public char[] getHd14InstDesc() throws CFException{
     if (isHd14InstDescModified()) { 
        hd14InstDesc = refreshHd14InstDesc();
     }
   		return hd14InstDesc;
   }

  
	/**
	*  set variable hd14InstDesc
	*  Corresponding COBOL Variable is HD1-4-INST-DESC
	*  @param value
	**/
   public void setHd14InstDesc(char[] value) {
      hd14InstDesc = checkHd14InstDescConstraints(value);
      serializeHd14InstDesc(hd14InstDesc);
   } 

     /**
	 * 	Update Hd14InstDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd14InstDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd14InstDesc,hd14InstDesc.length);
   	
   }
   
   public void setHd14InstDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd14InstDesc,hd14InstDesc.length);
   	
   }
   
     /**
	 * 	Update Hd14InstDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd14InstDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd14InstDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd14InstDesc with another Field
	 *	@param value
	 */
   public void setHd14InstDesc(Field source) {
       replace(source,0,source.length(),beginHd14InstDesc,HD_14_INST_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd14InstDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd14InstDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd14InstDesc,HD_14_INST_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Hd14InstDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd14InstDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd14InstDesc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd14BinNumber
	 *	@return hd14BinNumber
	 */
   public char[] getHd14BinNumber() throws CFException{
     if (isHd14BinNumberModified()) { 
        hd14BinNumber = refreshHd14BinNumber();
     }
   		return hd14BinNumber;
   }

  
	/**
	*  set variable hd14BinNumber
	*  Corresponding COBOL Variable is HD1-4-BIN-NUMBER
	*  @param value
	**/
   public void setHd14BinNumber(char[] value) {
      hd14BinNumber = checkHd14BinNumberConstraints(value);
      serializeHd14BinNumber(hd14BinNumber);
   } 

     /**
	 * 	Update Hd14BinNumber 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd14BinNumber(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd14BinNumber,hd14BinNumber.length);
   	
   }
   
   public void setHd14BinNumber(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd14BinNumber,hd14BinNumber.length);
   	
   }
   
     /**
	 * 	Update Hd14BinNumber 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd14BinNumber(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd14BinNumber+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd14BinNumber with another Field
	 *	@param value
	 */
   public void setHd14BinNumber(Field source) {
       replace(source,0,source.length(),beginHd14BinNumber,HD_14_BIN_NUMBER_LEN);
   	
   }  
   
     /**
	 * 	Update Hd14BinNumber 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd14BinNumber(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd14BinNumber,HD_14_BIN_NUMBER_LEN);
   	
   }
   
     /**
	 * 	Update Hd14BinNumber 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd14BinNumber(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd14BinNumber+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd14BinId
	 *	@return hd14BinId
	 */
   public char[] getHd14BinId() throws CFException{
     if (isHd14BinIdModified()) { 
        hd14BinId = refreshHd14BinId();
     }
   		return hd14BinId;
   }

  
	/**
	*  set variable hd14BinId
	*  Corresponding COBOL Variable is HD1-4-BIN-ID
	*  @param value
	**/
   public void setHd14BinId(char[] value) {
      hd14BinId = checkHd14BinIdConstraints(value);
      serializeHd14BinId(hd14BinId);
   } 

     /**
	 * 	Update Hd14BinId 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd14BinId(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd14BinId,hd14BinId.length);
   	
   }
   
   public void setHd14BinId(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd14BinId,hd14BinId.length);
   	
   }
   
     /**
	 * 	Update Hd14BinId 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd14BinId(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd14BinId+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd14BinId with another Field
	 *	@param value
	 */
   public void setHd14BinId(Field source) {
       replace(source,0,source.length(),beginHd14BinId,HD_14_BIN_ID_LEN);
   	
   }  
   
     /**
	 * 	Update Hd14BinId 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd14BinId(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd14BinId,HD_14_BIN_ID_LEN);
   	
   }
   
     /**
	 * 	Update Hd14BinId 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd14BinId(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd14BinId+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdPage1Ln4FieldLength() {
			return HD_PAGE_1_LN_4_LENGTH;
		}

}
  
