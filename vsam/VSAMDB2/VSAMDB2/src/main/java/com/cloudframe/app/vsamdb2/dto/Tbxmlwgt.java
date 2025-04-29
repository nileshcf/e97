package com.cloudframe.app.vsamdb2.dto;

/**
*  The class Tbxmlwgt is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:15. using version 5.0.0.257
**/


import com.cloudframe.app.vsamdb2.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.math.BigDecimal;


public class Tbxmlwgt extends TbxmlwgtSerialized {
   

						private char[] widgetNum = Field.fillLowValue(8);

						private char[] widgetColor = Field.fillLowValue(6);

								private BigDecimal widgetPrice = BigDecimal.ZERO;

						private char[] widgetDesc = Field.fillLowValue(20);
	
	/**
	* Constructor for Tbxmlwgt
	**/
    public Tbxmlwgt() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of widgetNum
	 *	@return widgetNum
	 */
   public char[] getWidgetNum() throws CFException{
     if (isWidgetNumModified()) { 
        widgetNum = refreshWidgetNum();
     }
   		return widgetNum;
   }

  
	/**
	*  set variable widgetNum
	*  Corresponding COBOL Variable is WIDGET-NUM
	*  @param value
	**/
   public void setWidgetNum(char[] value) {
      widgetNum = checkWidgetNumConstraints(value);
      serializeWidgetNum(widgetNum);
   } 

     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetNum,widgetNum.length);
   	
   }
   
   public void setWidgetNum(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetNum,widgetNum.length);
   	
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetNum+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetNum with another Field
	 *	@param value
	 */
   public void setWidgetNum(Field source) {
       replace(source,0,source.length(),beginWidgetNum,WIDGET_NUM_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetNum,WIDGET_NUM_LEN);
   	
   }
   
     /**
	 * 	Update WidgetNum 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetNum(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetNum+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of widgetColor
	 *	@return widgetColor
	 */
   public char[] getWidgetColor() throws CFException{
     if (isWidgetColorModified()) { 
        widgetColor = refreshWidgetColor();
     }
   		return widgetColor;
   }

  
	/**
	*  set variable widgetColor
	*  Corresponding COBOL Variable is WIDGET-COLOR
	*  @param value
	**/
   public void setWidgetColor(char[] value) {
      widgetColor = checkWidgetColorConstraints(value);
      serializeWidgetColor(widgetColor);
   } 

     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetColor,widgetColor.length);
   	
   }
   
   public void setWidgetColor(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetColor,widgetColor.length);
   	
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetColor+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetColor with another Field
	 *	@param value
	 */
   public void setWidgetColor(Field source) {
       replace(source,0,source.length(),beginWidgetColor,WIDGET_COLOR_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetColor,WIDGET_COLOR_LEN);
   	
   }
   
     /**
	 * 	Update WidgetColor 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetColor(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetColor+targetIndex,targetLen);
    
   }
	public BigDecimal getWidgetPrice() throws CFException {
        if (isWidgetPriceModified()) { 
           widgetPrice = refreshWidgetPrice();
        }
   		return widgetPrice;
	}

    public char[] getWidgetPriceString() {
          return  widgetPriceString();
    }
	
	/**
	 * 	Update WidgetPrice with the passed number
	 *  Corresponding COBOL Variable is WIDGET-PRICE
	 *	@param number
	 */
	public void setWidgetPrice(BigDecimal number) {	
     widgetPrice = checkWidgetPriceMaxLimit(number);
	    serializeWidgetPrice(widgetPrice);
   }
	/**
	 *	Returns the value of widgetDesc
	 *	@return widgetDesc
	 */
   public char[] getWidgetDesc() throws CFException{
     if (isWidgetDescModified()) { 
        widgetDesc = refreshWidgetDesc();
     }
   		return widgetDesc;
   }

  
	/**
	*  set variable widgetDesc
	*  Corresponding COBOL Variable is WIDGET-DESC
	*  @param value
	**/
   public void setWidgetDesc(char[] value) {
      widgetDesc = checkWidgetDescConstraints(value);
      serializeWidgetDesc(widgetDesc);
   } 

     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginWidgetDesc,widgetDesc.length);
   	
   }
   
   public void setWidgetDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetDesc,widgetDesc.length);
   	
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update WidgetDesc with another Field
	 *	@param value
	 */
   public void setWidgetDesc(Field source) {
       replace(source,0,source.length(),beginWidgetDesc,WIDGET_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginWidgetDesc,WIDGET_DESC_LEN);
   	
   }
   
     /**
	 * 	Update WidgetDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setWidgetDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginWidgetDesc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTbxmlwgtFieldLength() {
			return TBXMLWGT_LENGTH;
		}

}
  
