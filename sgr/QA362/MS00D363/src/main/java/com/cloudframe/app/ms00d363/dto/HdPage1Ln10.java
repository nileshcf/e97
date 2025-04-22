package com.cloudframe.app.ms00d363.dto;

/**
*  The class HdPage1Ln10 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class HdPage1Ln10 extends HdPage1Ln10Serialized {
   

						private char[] hd110Cc = new char[1];


						private char[] hd110Desc = Field.fillLowValue(25);

	
	/**
	* Constructor for HdPage1Ln10
	**/
    public HdPage1Ln10() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
								setHd110Cc(("0").toCharArray());
       replaceValue( // serialize and save the value
             fillSpace(1)
             , getStartOffset() + 1
             ,1
             );
       replaceValue( // serialize and save the value
             fillSpace(24)
             , getStartOffset() + 27
             ,24
             );
    }


 

	/**
	 *	Returns the value of hd110Cc
	 *	@return hd110Cc
	 */
   public char[] getHd110Cc() throws CFException{
     if (isHd110CcModified()) { 
        hd110Cc = refreshHd110Cc();
     }
   		return hd110Cc;
   }

  
	/**
	*  set variable hd110Cc
	*  Corresponding COBOL Variable is HD1-10-CC
	*  @param value
	**/
   public void setHd110Cc(char[] value) {
      hd110Cc = checkHd110CcConstraints(value);
      serializeHd110Cc(hd110Cc);
   } 

     /**
	 * 	Update Hd110Cc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd110Cc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd110Cc,hd110Cc.length);
   	
   }
   
   public void setHd110Cc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd110Cc,hd110Cc.length);
   	
   }
   
     /**
	 * 	Update Hd110Cc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd110Cc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd110Cc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd110Cc with another Field
	 *	@param value
	 */
   public void setHd110Cc(Field source) {
       replace(source,0,source.length(),beginHd110Cc,HD_110_CC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd110Cc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd110Cc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd110Cc,HD_110_CC_LEN);
   	
   }
   
     /**
	 * 	Update Hd110Cc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd110Cc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd110Cc+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of hd110Desc
	 *	@return hd110Desc
	 */
   public char[] getHd110Desc() throws CFException{
     if (isHd110DescModified()) { 
        hd110Desc = refreshHd110Desc();
     }
   		return hd110Desc;
   }

  
	/**
	*  set variable hd110Desc
	*  Corresponding COBOL Variable is HD1-10-DESC
	*  @param value
	**/
   public void setHd110Desc(char[] value) {
      hd110Desc = checkHd110DescConstraints(value);
      serializeHd110Desc(hd110Desc);
   } 

     /**
	 * 	Update Hd110Desc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setHd110Desc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginHd110Desc,hd110Desc.length);
   	
   }
   
   public void setHd110Desc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginHd110Desc,hd110Desc.length);
   	
   }
   
     /**
	 * 	Update Hd110Desc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setHd110Desc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd110Desc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Hd110Desc with another Field
	 *	@param value
	 */
   public void setHd110Desc(Field source) {
       replace(source,0,source.length(),beginHd110Desc,HD_110_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update Hd110Desc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setHd110Desc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginHd110Desc,HD_110_DESC_LEN);
   	
   }
   
     /**
	 * 	Update Hd110Desc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setHd110Desc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginHd110Desc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getHdPage1Ln10FieldLength() {
			return HD_PAGE_1_LN_10_LENGTH;
		}

}
  
