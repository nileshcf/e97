package com.cloudframe.app.comput3.dto.serialize;

/**
*  The class WcLitresSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WcLitresSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcLitresSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WC_LITRES_LENGTH = 108;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcLitBbl;
            protected  int beginWcLitKb;
            protected  int beginWcLitLit;
            protected  int beginWcLitM3;
            protected  int beginWcLitUsg;
            protected  int beginWcLitUkg;
            protected  int beginWcLitMmb;
            protected  int beginWcLitGbt;
            protected  int beginWcLitThm;
            protected  int beginWcLitMwh;
            protected  int beginWcLitGj;
            protected  int beginWcLitDay;
	
	/**
	* Constructor for WcLitresSerialized
	**/
    public WcLitresSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcLitresSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcLitresSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcLitresSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,216); // serialize this field at offset 216 by default 
    }
    
	/**
	* sets parent for this WcLitresSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 216 by default
    }    
	/**
	* initializes the field in WcLitresSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WC_LITRES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcLitBbl = getStartOffset() + 0;	// set offset for serialization
  
             beginWcLitKb = getStartOffset() + 9;	// set offset for serialization
  
             beginWcLitLit = getStartOffset() + 18;	// set offset for serialization
  
             beginWcLitM3 = getStartOffset() + 27;	// set offset for serialization
  
             beginWcLitUsg = getStartOffset() + 36;	// set offset for serialization
  
             beginWcLitUkg = getStartOffset() + 45;	// set offset for serialization
  
             beginWcLitMmb = getStartOffset() + 54;	// set offset for serialization
  
             beginWcLitGbt = getStartOffset() + 63;	// set offset for serialization
  
             beginWcLitThm = getStartOffset() + 72;	// set offset for serialization
  
             beginWcLitMwh = getStartOffset() + 81;	// set offset for serialization
  
             beginWcLitGj = getStartOffset() + 90;	// set offset for serialization
  
             beginWcLitDay = getStartOffset() + 99;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localWcLitBblCounter = -1;
        public boolean isWcLitBblModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcLitBblCounter != sharedCounter;
           localWcLitBblCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcLitBblIsNumeric() {
	      return decimalIsNumeric(beginWcLitBbl,WC_LIT_BBL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcLitBblString() {
            return getPackedString(beginWcLitBbl,WC_LIT_BBL_LEN);
         }
   protected static final int WC_LIT_BBL_LEN = 9;
   protected static final int WC_LIT_BBL_SCALE = 4;
  	/**
	 * 	serializeWcLitBbl
	 */
	protected void serializeWcLitBbl(BigDecimal wcLitBbl) {
		   putDecimal(beginWcLitBbl,wcLitBbl,WC_LIT_BBL_LEN,WC_LIT_BBL_SCALE,true);
		 localWcLitBblCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcLitBblMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcLitBbl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcLitBbl() throws CFException {	
   	try { 
		 return (getDecimal(beginWcLitBbl,WC_LIT_BBL_LEN,WC_LIT_BBL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcLitBbl", beginWcLitBbl,WC_LIT_BBL_LEN);
     }
   	}
        int localWcLitKbCounter = -1;
        public boolean isWcLitKbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcLitKbCounter != sharedCounter;
           localWcLitKbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcLitKbIsNumeric() {
	      return decimalIsNumeric(beginWcLitKb,WC_LIT_KB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcLitKbString() {
            return getPackedString(beginWcLitKb,WC_LIT_KB_LEN);
         }
   protected static final int WC_LIT_KB_LEN = 9;
   protected static final int WC_LIT_KB_SCALE = 4;
  	/**
	 * 	serializeWcLitKb
	 */
	protected void serializeWcLitKb(BigDecimal wcLitKb) {
		   putDecimal(beginWcLitKb,wcLitKb,WC_LIT_KB_LEN,WC_LIT_KB_SCALE,true);
		 localWcLitKbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcLitKbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcLitKb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcLitKb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcLitKb,WC_LIT_KB_LEN,WC_LIT_KB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcLitKb", beginWcLitKb,WC_LIT_KB_LEN);
     }
   	}
        int localWcLitLitCounter = -1;
        public boolean isWcLitLitModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcLitLitCounter != sharedCounter;
           localWcLitLitCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcLitLitIsNumeric() {
	      return decimalIsNumeric(beginWcLitLit,WC_LIT_LIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcLitLitString() {
            return getPackedString(beginWcLitLit,WC_LIT_LIT_LEN);
         }
   protected static final int WC_LIT_LIT_LEN = 9;
   protected static final int WC_LIT_LIT_SCALE = 4;
  	/**
	 * 	serializeWcLitLit
	 */
	protected void serializeWcLitLit(BigDecimal wcLitLit) {
		   putDecimal(beginWcLitLit,wcLitLit,WC_LIT_LIT_LEN,WC_LIT_LIT_SCALE,true);
		 localWcLitLitCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcLitLitMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcLitLit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcLitLit() throws CFException {	
   	try { 
		 return (getDecimal(beginWcLitLit,WC_LIT_LIT_LEN,WC_LIT_LIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcLitLit", beginWcLitLit,WC_LIT_LIT_LEN);
     }
   	}
        int localWcLitM3Counter = -1;
        public boolean isWcLitM3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcLitM3Counter != sharedCounter;
           localWcLitM3Counter = sharedCounter; return hasModified; 
        }
	    public boolean wcLitM3IsNumeric() {
	      return decimalIsNumeric(beginWcLitM3,WC_LIT_M_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcLitM3String() {
            return getPackedString(beginWcLitM3,WC_LIT_M_3_LEN);
         }
   protected static final int WC_LIT_M_3_LEN = 9;
   protected static final int WC_LIT_M_3_SCALE = 4;
  	/**
	 * 	serializeWcLitM3
	 */
	protected void serializeWcLitM3(BigDecimal wcLitM3) {
		   putDecimal(beginWcLitM3,wcLitM3,WC_LIT_M_3_LEN,WC_LIT_M_3_SCALE,true);
		 localWcLitM3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcLitM3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcLitM3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcLitM3() throws CFException {	
   	try { 
		 return (getDecimal(beginWcLitM3,WC_LIT_M_3_LEN,WC_LIT_M_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcLitM3", beginWcLitM3,WC_LIT_M_3_LEN);
     }
   	}
        int localWcLitUsgCounter = -1;
        public boolean isWcLitUsgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcLitUsgCounter != sharedCounter;
           localWcLitUsgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcLitUsgIsNumeric() {
	      return decimalIsNumeric(beginWcLitUsg,WC_LIT_USG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcLitUsgString() {
            return getPackedString(beginWcLitUsg,WC_LIT_USG_LEN);
         }
   protected static final int WC_LIT_USG_LEN = 9;
   protected static final int WC_LIT_USG_SCALE = 4;
  	/**
	 * 	serializeWcLitUsg
	 */
	protected void serializeWcLitUsg(BigDecimal wcLitUsg) {
		   putDecimal(beginWcLitUsg,wcLitUsg,WC_LIT_USG_LEN,WC_LIT_USG_SCALE,true);
		 localWcLitUsgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcLitUsgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcLitUsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcLitUsg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcLitUsg,WC_LIT_USG_LEN,WC_LIT_USG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcLitUsg", beginWcLitUsg,WC_LIT_USG_LEN);
     }
   	}
        int localWcLitUkgCounter = -1;
        public boolean isWcLitUkgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcLitUkgCounter != sharedCounter;
           localWcLitUkgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcLitUkgIsNumeric() {
	      return decimalIsNumeric(beginWcLitUkg,WC_LIT_UKG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcLitUkgString() {
            return getPackedString(beginWcLitUkg,WC_LIT_UKG_LEN);
         }
   protected static final int WC_LIT_UKG_LEN = 9;
   protected static final int WC_LIT_UKG_SCALE = 4;
  	/**
	 * 	serializeWcLitUkg
	 */
	protected void serializeWcLitUkg(BigDecimal wcLitUkg) {
		   putDecimal(beginWcLitUkg,wcLitUkg,WC_LIT_UKG_LEN,WC_LIT_UKG_SCALE,true);
		 localWcLitUkgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcLitUkgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcLitUkg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcLitUkg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcLitUkg,WC_LIT_UKG_LEN,WC_LIT_UKG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcLitUkg", beginWcLitUkg,WC_LIT_UKG_LEN);
     }
   	}
        int localWcLitMmbCounter = -1;
        public boolean isWcLitMmbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcLitMmbCounter != sharedCounter;
           localWcLitMmbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcLitMmbIsNumeric() {
	      return decimalIsNumeric(beginWcLitMmb,WC_LIT_MMB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcLitMmbString() {
            return getPackedString(beginWcLitMmb,WC_LIT_MMB_LEN);
         }
   protected static final int WC_LIT_MMB_LEN = 9;
   protected static final int WC_LIT_MMB_SCALE = 4;
  	/**
	 * 	serializeWcLitMmb
	 */
	protected void serializeWcLitMmb(BigDecimal wcLitMmb) {
		   putDecimal(beginWcLitMmb,wcLitMmb,WC_LIT_MMB_LEN,WC_LIT_MMB_SCALE,true);
		 localWcLitMmbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcLitMmbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcLitMmb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcLitMmb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcLitMmb,WC_LIT_MMB_LEN,WC_LIT_MMB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcLitMmb", beginWcLitMmb,WC_LIT_MMB_LEN);
     }
   	}
        int localWcLitGbtCounter = -1;
        public boolean isWcLitGbtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcLitGbtCounter != sharedCounter;
           localWcLitGbtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcLitGbtIsNumeric() {
	      return decimalIsNumeric(beginWcLitGbt,WC_LIT_GBT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcLitGbtString() {
            return getPackedString(beginWcLitGbt,WC_LIT_GBT_LEN);
         }
   protected static final int WC_LIT_GBT_LEN = 9;
   protected static final int WC_LIT_GBT_SCALE = 4;
  	/**
	 * 	serializeWcLitGbt
	 */
	protected void serializeWcLitGbt(BigDecimal wcLitGbt) {
		   putDecimal(beginWcLitGbt,wcLitGbt,WC_LIT_GBT_LEN,WC_LIT_GBT_SCALE,true);
		 localWcLitGbtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcLitGbtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcLitGbt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcLitGbt() throws CFException {	
   	try { 
		 return (getDecimal(beginWcLitGbt,WC_LIT_GBT_LEN,WC_LIT_GBT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcLitGbt", beginWcLitGbt,WC_LIT_GBT_LEN);
     }
   	}
        int localWcLitThmCounter = -1;
        public boolean isWcLitThmModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcLitThmCounter != sharedCounter;
           localWcLitThmCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcLitThmIsNumeric() {
	      return decimalIsNumeric(beginWcLitThm,WC_LIT_THM_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcLitThmString() {
            return getPackedString(beginWcLitThm,WC_LIT_THM_LEN);
         }
   protected static final int WC_LIT_THM_LEN = 9;
   protected static final int WC_LIT_THM_SCALE = 4;
  	/**
	 * 	serializeWcLitThm
	 */
	protected void serializeWcLitThm(BigDecimal wcLitThm) {
		   putDecimal(beginWcLitThm,wcLitThm,WC_LIT_THM_LEN,WC_LIT_THM_SCALE,true);
		 localWcLitThmCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcLitThmMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcLitThm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcLitThm() throws CFException {	
   	try { 
		 return (getDecimal(beginWcLitThm,WC_LIT_THM_LEN,WC_LIT_THM_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcLitThm", beginWcLitThm,WC_LIT_THM_LEN);
     }
   	}
        int localWcLitMwhCounter = -1;
        public boolean isWcLitMwhModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcLitMwhCounter != sharedCounter;
           localWcLitMwhCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcLitMwhIsNumeric() {
	      return decimalIsNumeric(beginWcLitMwh,WC_LIT_MWH_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcLitMwhString() {
            return getPackedString(beginWcLitMwh,WC_LIT_MWH_LEN);
         }
   protected static final int WC_LIT_MWH_LEN = 9;
   protected static final int WC_LIT_MWH_SCALE = 4;
  	/**
	 * 	serializeWcLitMwh
	 */
	protected void serializeWcLitMwh(BigDecimal wcLitMwh) {
		   putDecimal(beginWcLitMwh,wcLitMwh,WC_LIT_MWH_LEN,WC_LIT_MWH_SCALE,true);
		 localWcLitMwhCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcLitMwhMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcLitMwh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcLitMwh() throws CFException {	
   	try { 
		 return (getDecimal(beginWcLitMwh,WC_LIT_MWH_LEN,WC_LIT_MWH_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcLitMwh", beginWcLitMwh,WC_LIT_MWH_LEN);
     }
   	}
        int localWcLitGjCounter = -1;
        public boolean isWcLitGjModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcLitGjCounter != sharedCounter;
           localWcLitGjCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcLitGjIsNumeric() {
	      return decimalIsNumeric(beginWcLitGj,WC_LIT_GJ_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcLitGjString() {
            return getPackedString(beginWcLitGj,WC_LIT_GJ_LEN);
         }
   protected static final int WC_LIT_GJ_LEN = 9;
   protected static final int WC_LIT_GJ_SCALE = 4;
  	/**
	 * 	serializeWcLitGj
	 */
	protected void serializeWcLitGj(BigDecimal wcLitGj) {
		   putDecimal(beginWcLitGj,wcLitGj,WC_LIT_GJ_LEN,WC_LIT_GJ_SCALE,true);
		 localWcLitGjCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcLitGjMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcLitGj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcLitGj() throws CFException {	
   	try { 
		 return (getDecimal(beginWcLitGj,WC_LIT_GJ_LEN,WC_LIT_GJ_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcLitGj", beginWcLitGj,WC_LIT_GJ_LEN);
     }
   	}
        int localWcLitDayCounter = -1;
        public boolean isWcLitDayModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcLitDayCounter != sharedCounter;
           localWcLitDayCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcLitDayIsNumeric() {
	      return decimalIsNumeric(beginWcLitDay,WC_LIT_DAY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcLitDayString() {
            return getPackedString(beginWcLitDay,WC_LIT_DAY_LEN);
         }
   protected static final int WC_LIT_DAY_LEN = 9;
   protected static final int WC_LIT_DAY_SCALE = 4;
  	/**
	 * 	serializeWcLitDay
	 */
	protected void serializeWcLitDay(BigDecimal wcLitDay) {
		   putDecimal(beginWcLitDay,wcLitDay,WC_LIT_DAY_LEN,WC_LIT_DAY_SCALE,true);
		 localWcLitDayCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcLitDayMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcLitDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcLitDay() throws CFException {	
   	try { 
		 return (getDecimal(beginWcLitDay,WC_LIT_DAY_LEN,WC_LIT_DAY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcLitDay", beginWcLitDay,WC_LIT_DAY_LEN);
     }
   	}




}
  
