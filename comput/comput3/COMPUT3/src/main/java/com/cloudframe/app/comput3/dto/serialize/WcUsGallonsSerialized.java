package com.cloudframe.app.comput3.dto.serialize;

/**
*  The class WcUsGallonsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WcUsGallonsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcUsGallonsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WC_US_GALLONS_LENGTH = 108;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcUsgBbl;
            protected  int beginWcUsgKb;
            protected  int beginWcUsgLit;
            protected  int beginWcUsgM3;
            protected  int beginWcUsgUsg;
            protected  int beginWcUsgUkg;
            protected  int beginWcUsgMmb;
            protected  int beginWcUsgGbt;
            protected  int beginWcUsgThm;
            protected  int beginWcUsgMwh;
            protected  int beginWcUsgGj;
            protected  int beginWcUsgDay;
	
	/**
	* Constructor for WcUsGallonsSerialized
	**/
    public WcUsGallonsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcUsGallonsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcUsGallonsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcUsGallonsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,432); // serialize this field at offset 432 by default 
    }
    
	/**
	* sets parent for this WcUsGallonsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 432 by default
    }    
	/**
	* initializes the field in WcUsGallonsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WC_US_GALLONS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcUsgBbl = getStartOffset() + 0;	// set offset for serialization
  
             beginWcUsgKb = getStartOffset() + 9;	// set offset for serialization
  
             beginWcUsgLit = getStartOffset() + 18;	// set offset for serialization
  
             beginWcUsgM3 = getStartOffset() + 27;	// set offset for serialization
  
             beginWcUsgUsg = getStartOffset() + 36;	// set offset for serialization
  
             beginWcUsgUkg = getStartOffset() + 45;	// set offset for serialization
  
             beginWcUsgMmb = getStartOffset() + 54;	// set offset for serialization
  
             beginWcUsgGbt = getStartOffset() + 63;	// set offset for serialization
  
             beginWcUsgThm = getStartOffset() + 72;	// set offset for serialization
  
             beginWcUsgMwh = getStartOffset() + 81;	// set offset for serialization
  
             beginWcUsgGj = getStartOffset() + 90;	// set offset for serialization
  
             beginWcUsgDay = getStartOffset() + 99;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localWcUsgBblCounter = -1;
        public boolean isWcUsgBblModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUsgBblCounter != sharedCounter;
           localWcUsgBblCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUsgBblIsNumeric() {
	      return decimalIsNumeric(beginWcUsgBbl,WC_USG_BBL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUsgBblString() {
            return getPackedString(beginWcUsgBbl,WC_USG_BBL_LEN);
         }
   protected static final int WC_USG_BBL_LEN = 9;
   protected static final int WC_USG_BBL_SCALE = 4;
  	/**
	 * 	serializeWcUsgBbl
	 */
	protected void serializeWcUsgBbl(BigDecimal wcUsgBbl) {
		   putDecimal(beginWcUsgBbl,wcUsgBbl,WC_USG_BBL_LEN,WC_USG_BBL_SCALE,true);
		 localWcUsgBblCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUsgBblMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUsgBbl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUsgBbl() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUsgBbl,WC_USG_BBL_LEN,WC_USG_BBL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUsgBbl", beginWcUsgBbl,WC_USG_BBL_LEN);
     }
   	}
        int localWcUsgKbCounter = -1;
        public boolean isWcUsgKbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUsgKbCounter != sharedCounter;
           localWcUsgKbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUsgKbIsNumeric() {
	      return decimalIsNumeric(beginWcUsgKb,WC_USG_KB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUsgKbString() {
            return getPackedString(beginWcUsgKb,WC_USG_KB_LEN);
         }
   protected static final int WC_USG_KB_LEN = 9;
   protected static final int WC_USG_KB_SCALE = 4;
  	/**
	 * 	serializeWcUsgKb
	 */
	protected void serializeWcUsgKb(BigDecimal wcUsgKb) {
		   putDecimal(beginWcUsgKb,wcUsgKb,WC_USG_KB_LEN,WC_USG_KB_SCALE,true);
		 localWcUsgKbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUsgKbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUsgKb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUsgKb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUsgKb,WC_USG_KB_LEN,WC_USG_KB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUsgKb", beginWcUsgKb,WC_USG_KB_LEN);
     }
   	}
        int localWcUsgLitCounter = -1;
        public boolean isWcUsgLitModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUsgLitCounter != sharedCounter;
           localWcUsgLitCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUsgLitIsNumeric() {
	      return decimalIsNumeric(beginWcUsgLit,WC_USG_LIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUsgLitString() {
            return getPackedString(beginWcUsgLit,WC_USG_LIT_LEN);
         }
   protected static final int WC_USG_LIT_LEN = 9;
   protected static final int WC_USG_LIT_SCALE = 4;
  	/**
	 * 	serializeWcUsgLit
	 */
	protected void serializeWcUsgLit(BigDecimal wcUsgLit) {
		   putDecimal(beginWcUsgLit,wcUsgLit,WC_USG_LIT_LEN,WC_USG_LIT_SCALE,true);
		 localWcUsgLitCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUsgLitMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUsgLit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUsgLit() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUsgLit,WC_USG_LIT_LEN,WC_USG_LIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUsgLit", beginWcUsgLit,WC_USG_LIT_LEN);
     }
   	}
        int localWcUsgM3Counter = -1;
        public boolean isWcUsgM3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUsgM3Counter != sharedCounter;
           localWcUsgM3Counter = sharedCounter; return hasModified; 
        }
	    public boolean wcUsgM3IsNumeric() {
	      return decimalIsNumeric(beginWcUsgM3,WC_USG_M_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUsgM3String() {
            return getPackedString(beginWcUsgM3,WC_USG_M_3_LEN);
         }
   protected static final int WC_USG_M_3_LEN = 9;
   protected static final int WC_USG_M_3_SCALE = 4;
  	/**
	 * 	serializeWcUsgM3
	 */
	protected void serializeWcUsgM3(BigDecimal wcUsgM3) {
		   putDecimal(beginWcUsgM3,wcUsgM3,WC_USG_M_3_LEN,WC_USG_M_3_SCALE,true);
		 localWcUsgM3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUsgM3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUsgM3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUsgM3() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUsgM3,WC_USG_M_3_LEN,WC_USG_M_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUsgM3", beginWcUsgM3,WC_USG_M_3_LEN);
     }
   	}
        int localWcUsgUsgCounter = -1;
        public boolean isWcUsgUsgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUsgUsgCounter != sharedCounter;
           localWcUsgUsgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUsgUsgIsNumeric() {
	      return decimalIsNumeric(beginWcUsgUsg,WC_USG_USG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUsgUsgString() {
            return getPackedString(beginWcUsgUsg,WC_USG_USG_LEN);
         }
   protected static final int WC_USG_USG_LEN = 9;
   protected static final int WC_USG_USG_SCALE = 4;
  	/**
	 * 	serializeWcUsgUsg
	 */
	protected void serializeWcUsgUsg(BigDecimal wcUsgUsg) {
		   putDecimal(beginWcUsgUsg,wcUsgUsg,WC_USG_USG_LEN,WC_USG_USG_SCALE,true);
		 localWcUsgUsgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUsgUsgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUsgUsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUsgUsg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUsgUsg,WC_USG_USG_LEN,WC_USG_USG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUsgUsg", beginWcUsgUsg,WC_USG_USG_LEN);
     }
   	}
        int localWcUsgUkgCounter = -1;
        public boolean isWcUsgUkgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUsgUkgCounter != sharedCounter;
           localWcUsgUkgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUsgUkgIsNumeric() {
	      return decimalIsNumeric(beginWcUsgUkg,WC_USG_UKG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUsgUkgString() {
            return getPackedString(beginWcUsgUkg,WC_USG_UKG_LEN);
         }
   protected static final int WC_USG_UKG_LEN = 9;
   protected static final int WC_USG_UKG_SCALE = 4;
  	/**
	 * 	serializeWcUsgUkg
	 */
	protected void serializeWcUsgUkg(BigDecimal wcUsgUkg) {
		   putDecimal(beginWcUsgUkg,wcUsgUkg,WC_USG_UKG_LEN,WC_USG_UKG_SCALE,true);
		 localWcUsgUkgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUsgUkgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUsgUkg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUsgUkg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUsgUkg,WC_USG_UKG_LEN,WC_USG_UKG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUsgUkg", beginWcUsgUkg,WC_USG_UKG_LEN);
     }
   	}
        int localWcUsgMmbCounter = -1;
        public boolean isWcUsgMmbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUsgMmbCounter != sharedCounter;
           localWcUsgMmbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUsgMmbIsNumeric() {
	      return decimalIsNumeric(beginWcUsgMmb,WC_USG_MMB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUsgMmbString() {
            return getPackedString(beginWcUsgMmb,WC_USG_MMB_LEN);
         }
   protected static final int WC_USG_MMB_LEN = 9;
   protected static final int WC_USG_MMB_SCALE = 4;
  	/**
	 * 	serializeWcUsgMmb
	 */
	protected void serializeWcUsgMmb(BigDecimal wcUsgMmb) {
		   putDecimal(beginWcUsgMmb,wcUsgMmb,WC_USG_MMB_LEN,WC_USG_MMB_SCALE,true);
		 localWcUsgMmbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUsgMmbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUsgMmb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUsgMmb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUsgMmb,WC_USG_MMB_LEN,WC_USG_MMB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUsgMmb", beginWcUsgMmb,WC_USG_MMB_LEN);
     }
   	}
        int localWcUsgGbtCounter = -1;
        public boolean isWcUsgGbtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUsgGbtCounter != sharedCounter;
           localWcUsgGbtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUsgGbtIsNumeric() {
	      return decimalIsNumeric(beginWcUsgGbt,WC_USG_GBT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUsgGbtString() {
            return getPackedString(beginWcUsgGbt,WC_USG_GBT_LEN);
         }
   protected static final int WC_USG_GBT_LEN = 9;
   protected static final int WC_USG_GBT_SCALE = 4;
  	/**
	 * 	serializeWcUsgGbt
	 */
	protected void serializeWcUsgGbt(BigDecimal wcUsgGbt) {
		   putDecimal(beginWcUsgGbt,wcUsgGbt,WC_USG_GBT_LEN,WC_USG_GBT_SCALE,true);
		 localWcUsgGbtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUsgGbtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUsgGbt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUsgGbt() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUsgGbt,WC_USG_GBT_LEN,WC_USG_GBT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUsgGbt", beginWcUsgGbt,WC_USG_GBT_LEN);
     }
   	}
        int localWcUsgThmCounter = -1;
        public boolean isWcUsgThmModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUsgThmCounter != sharedCounter;
           localWcUsgThmCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUsgThmIsNumeric() {
	      return decimalIsNumeric(beginWcUsgThm,WC_USG_THM_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUsgThmString() {
            return getPackedString(beginWcUsgThm,WC_USG_THM_LEN);
         }
   protected static final int WC_USG_THM_LEN = 9;
   protected static final int WC_USG_THM_SCALE = 4;
  	/**
	 * 	serializeWcUsgThm
	 */
	protected void serializeWcUsgThm(BigDecimal wcUsgThm) {
		   putDecimal(beginWcUsgThm,wcUsgThm,WC_USG_THM_LEN,WC_USG_THM_SCALE,true);
		 localWcUsgThmCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUsgThmMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUsgThm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUsgThm() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUsgThm,WC_USG_THM_LEN,WC_USG_THM_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUsgThm", beginWcUsgThm,WC_USG_THM_LEN);
     }
   	}
        int localWcUsgMwhCounter = -1;
        public boolean isWcUsgMwhModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUsgMwhCounter != sharedCounter;
           localWcUsgMwhCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUsgMwhIsNumeric() {
	      return decimalIsNumeric(beginWcUsgMwh,WC_USG_MWH_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUsgMwhString() {
            return getPackedString(beginWcUsgMwh,WC_USG_MWH_LEN);
         }
   protected static final int WC_USG_MWH_LEN = 9;
   protected static final int WC_USG_MWH_SCALE = 4;
  	/**
	 * 	serializeWcUsgMwh
	 */
	protected void serializeWcUsgMwh(BigDecimal wcUsgMwh) {
		   putDecimal(beginWcUsgMwh,wcUsgMwh,WC_USG_MWH_LEN,WC_USG_MWH_SCALE,true);
		 localWcUsgMwhCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUsgMwhMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUsgMwh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUsgMwh() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUsgMwh,WC_USG_MWH_LEN,WC_USG_MWH_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUsgMwh", beginWcUsgMwh,WC_USG_MWH_LEN);
     }
   	}
        int localWcUsgGjCounter = -1;
        public boolean isWcUsgGjModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUsgGjCounter != sharedCounter;
           localWcUsgGjCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUsgGjIsNumeric() {
	      return decimalIsNumeric(beginWcUsgGj,WC_USG_GJ_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUsgGjString() {
            return getPackedString(beginWcUsgGj,WC_USG_GJ_LEN);
         }
   protected static final int WC_USG_GJ_LEN = 9;
   protected static final int WC_USG_GJ_SCALE = 4;
  	/**
	 * 	serializeWcUsgGj
	 */
	protected void serializeWcUsgGj(BigDecimal wcUsgGj) {
		   putDecimal(beginWcUsgGj,wcUsgGj,WC_USG_GJ_LEN,WC_USG_GJ_SCALE,true);
		 localWcUsgGjCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUsgGjMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUsgGj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUsgGj() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUsgGj,WC_USG_GJ_LEN,WC_USG_GJ_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUsgGj", beginWcUsgGj,WC_USG_GJ_LEN);
     }
   	}
        int localWcUsgDayCounter = -1;
        public boolean isWcUsgDayModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcUsgDayCounter != sharedCounter;
           localWcUsgDayCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcUsgDayIsNumeric() {
	      return decimalIsNumeric(beginWcUsgDay,WC_USG_DAY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcUsgDayString() {
            return getPackedString(beginWcUsgDay,WC_USG_DAY_LEN);
         }
   protected static final int WC_USG_DAY_LEN = 9;
   protected static final int WC_USG_DAY_SCALE = 4;
  	/**
	 * 	serializeWcUsgDay
	 */
	protected void serializeWcUsgDay(BigDecimal wcUsgDay) {
		   putDecimal(beginWcUsgDay,wcUsgDay,WC_USG_DAY_LEN,WC_USG_DAY_SCALE,true);
		 localWcUsgDayCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcUsgDayMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcUsgDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcUsgDay() throws CFException {	
   	try { 
		 return (getDecimal(beginWcUsgDay,WC_USG_DAY_LEN,WC_USG_DAY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcUsgDay", beginWcUsgDay,WC_USG_DAY_LEN);
     }
   	}




}
  
