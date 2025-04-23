package com.cloudframe.app.vsamdb2.dto.serialize;

/**
*  The class TbxmlwgtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class TbxmlwgtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TbxmlwgtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TBXMLWGT_LENGTH = 61;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWidgetNum;
            protected  int beginWidgetColor;
            protected  int beginWidgetPrice;
            protected  int beginWidgetDesc;
	
	/**
	* Constructor for TbxmlwgtSerialized
	**/
    public TbxmlwgtSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TbxmlwgtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TBXMLWGT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWidgetNum = getStartOffset() + 0;	// set offset for serialization
  
             beginWidgetColor = getStartOffset() + 8;	// set offset for serialization
  
             beginWidgetPrice = getStartOffset() + 15;	// set offset for serialization
  
             beginWidgetDesc = getStartOffset() + 27;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWidgetNumCounter = -1;
     public boolean isWidgetNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetNumCounter != sharedCounter;
         localWidgetNumCounter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_NUM_LEN = 8;
	/**
	 * 	serialize this WidgetNum
	 */
   protected void serializeWidgetNum(char[] widgetNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetNum,0,getStringValue(),beginWidgetNum,WIDGET_NUM_LEN);
       localWidgetNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetNumConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshWidgetNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetNum() {	 
   		return (substring(getStringValue(),beginWidgetNum,beginWidgetNum + WIDGET_NUM_LEN));
   	}
     int localWidgetColorCounter = -1;
     public boolean isWidgetColorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetColorCounter != sharedCounter;
         localWidgetColorCounter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_COLOR_LEN = 6;
	/**
	 * 	serialize this WidgetColor
	 */
   protected void serializeWidgetColor(char[] widgetColor) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetColor,0,getStringValue(),beginWidgetColor,WIDGET_COLOR_LEN);
       localWidgetColorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetColorConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshWidgetColor is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetColor() {	 
   		return (substring(getStringValue(),beginWidgetColor,beginWidgetColor + WIDGET_COLOR_LEN));
   	}
        int localWidgetPriceCounter = -1;
        public boolean isWidgetPriceModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWidgetPriceCounter != sharedCounter;
           localWidgetPriceCounter = sharedCounter; return hasModified; 
        }
	    public boolean widgetPriceIsNumeric() {
	      return decimalIsNumeric(beginWidgetPrice,WIDGET_PRICE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] widgetPriceString() {
            return getPackedString(beginWidgetPrice,WIDGET_PRICE_LEN);
         }
   protected static final int WIDGET_PRICE_LEN = 4;
   protected static final int WIDGET_PRICE_SCALE = 2;
  	/**
	 * 	serializeWidgetPrice
	 */
	protected void serializeWidgetPrice(BigDecimal widgetPrice) {
		   putDecimal(beginWidgetPrice,widgetPrice,WIDGET_PRICE_LEN,WIDGET_PRICE_SCALE,true);
		 localWidgetPriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWidgetPriceMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }
     /**
	 *	refreshWidgetPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWidgetPrice() throws CFException {	
   	try { 
		 return (getDecimal(beginWidgetPrice,WIDGET_PRICE_LEN,WIDGET_PRICE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("widgetPrice", beginWidgetPrice,WIDGET_PRICE_LEN);
     }
   	}
     int localWidgetDescCounter = -1;
     public boolean isWidgetDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWidgetDescCounter != sharedCounter;
         localWidgetDescCounter = sharedCounter; return hasModified;
     }
	protected static final int WIDGET_DESC_LEN = 20;
	/**
	 * 	serialize this WidgetDesc
	 */
   protected void serializeWidgetDesc(char[] widgetDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(widgetDesc,0,getStringValue(),beginWidgetDesc,WIDGET_DESC_LEN);
       localWidgetDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWidgetDescConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshWidgetDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWidgetDesc() {	 
   		return (substring(getStringValue(),beginWidgetDesc,beginWidgetDesc + WIDGET_DESC_LEN));
   	}




}
  
