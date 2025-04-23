package com.cloudframe.app.comput3.dto.serialize;

/**
*  The class WcThmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:17. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WcThmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WcThmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WC_THM_LENGTH = 108;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcThmBbl;
            protected  int beginWcThmKb;
            protected  int beginWcThmLit;
            protected  int beginWcThmM3;
            protected  int beginWcThmUsg;
            protected  int beginWcThmUkg;
            protected  int beginWcThmMmb;
            protected  int beginWcThmGbt;
            protected  int beginWcThmThm;
            protected  int beginWcThmMwh;
            protected  int beginWcThmGj;
            protected  int beginWcThmDay;
	
	/**
	* Constructor for WcThmSerialized
	**/
    public WcThmSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WcThmSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WcThmSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WcThmSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,864); // serialize this field at offset 864 by default 
    }
    
	/**
	* sets parent for this WcThmSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 864 by default
    }    
	/**
	* initializes the field in WcThmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WC_THM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcThmBbl = getStartOffset() + 0;	// set offset for serialization
  
             beginWcThmKb = getStartOffset() + 9;	// set offset for serialization
  
             beginWcThmLit = getStartOffset() + 18;	// set offset for serialization
  
             beginWcThmM3 = getStartOffset() + 27;	// set offset for serialization
  
             beginWcThmUsg = getStartOffset() + 36;	// set offset for serialization
  
             beginWcThmUkg = getStartOffset() + 45;	// set offset for serialization
  
             beginWcThmMmb = getStartOffset() + 54;	// set offset for serialization
  
             beginWcThmGbt = getStartOffset() + 63;	// set offset for serialization
  
             beginWcThmThm = getStartOffset() + 72;	// set offset for serialization
  
             beginWcThmMwh = getStartOffset() + 81;	// set offset for serialization
  
             beginWcThmGj = getStartOffset() + 90;	// set offset for serialization
  
             beginWcThmDay = getStartOffset() + 99;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localWcThmBblCounter = -1;
        public boolean isWcThmBblModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcThmBblCounter != sharedCounter;
           localWcThmBblCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcThmBblIsNumeric() {
	      return decimalIsNumeric(beginWcThmBbl,WC_THM_BBL_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcThmBblString() {
            return getPackedString(beginWcThmBbl,WC_THM_BBL_LEN);
         }
   protected static final int WC_THM_BBL_LEN = 9;
   protected static final int WC_THM_BBL_SCALE = 4;
  	/**
	 * 	serializeWcThmBbl
	 */
	protected void serializeWcThmBbl(BigDecimal wcThmBbl) {
		   putDecimal(beginWcThmBbl,wcThmBbl,WC_THM_BBL_LEN,WC_THM_BBL_SCALE,true);
		 localWcThmBblCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcThmBblMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcThmBbl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcThmBbl() throws CFException {	
   	try { 
		 return (getDecimal(beginWcThmBbl,WC_THM_BBL_LEN,WC_THM_BBL_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcThmBbl", beginWcThmBbl,WC_THM_BBL_LEN);
     }
   	}
        int localWcThmKbCounter = -1;
        public boolean isWcThmKbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcThmKbCounter != sharedCounter;
           localWcThmKbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcThmKbIsNumeric() {
	      return decimalIsNumeric(beginWcThmKb,WC_THM_KB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcThmKbString() {
            return getPackedString(beginWcThmKb,WC_THM_KB_LEN);
         }
   protected static final int WC_THM_KB_LEN = 9;
   protected static final int WC_THM_KB_SCALE = 4;
  	/**
	 * 	serializeWcThmKb
	 */
	protected void serializeWcThmKb(BigDecimal wcThmKb) {
		   putDecimal(beginWcThmKb,wcThmKb,WC_THM_KB_LEN,WC_THM_KB_SCALE,true);
		 localWcThmKbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcThmKbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcThmKb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcThmKb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcThmKb,WC_THM_KB_LEN,WC_THM_KB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcThmKb", beginWcThmKb,WC_THM_KB_LEN);
     }
   	}
        int localWcThmLitCounter = -1;
        public boolean isWcThmLitModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcThmLitCounter != sharedCounter;
           localWcThmLitCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcThmLitIsNumeric() {
	      return decimalIsNumeric(beginWcThmLit,WC_THM_LIT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcThmLitString() {
            return getPackedString(beginWcThmLit,WC_THM_LIT_LEN);
         }
   protected static final int WC_THM_LIT_LEN = 9;
   protected static final int WC_THM_LIT_SCALE = 4;
  	/**
	 * 	serializeWcThmLit
	 */
	protected void serializeWcThmLit(BigDecimal wcThmLit) {
		   putDecimal(beginWcThmLit,wcThmLit,WC_THM_LIT_LEN,WC_THM_LIT_SCALE,true);
		 localWcThmLitCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcThmLitMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcThmLit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcThmLit() throws CFException {	
   	try { 
		 return (getDecimal(beginWcThmLit,WC_THM_LIT_LEN,WC_THM_LIT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcThmLit", beginWcThmLit,WC_THM_LIT_LEN);
     }
   	}
        int localWcThmM3Counter = -1;
        public boolean isWcThmM3Modified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcThmM3Counter != sharedCounter;
           localWcThmM3Counter = sharedCounter; return hasModified; 
        }
	    public boolean wcThmM3IsNumeric() {
	      return decimalIsNumeric(beginWcThmM3,WC_THM_M_3_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcThmM3String() {
            return getPackedString(beginWcThmM3,WC_THM_M_3_LEN);
         }
   protected static final int WC_THM_M_3_LEN = 9;
   protected static final int WC_THM_M_3_SCALE = 4;
  	/**
	 * 	serializeWcThmM3
	 */
	protected void serializeWcThmM3(BigDecimal wcThmM3) {
		   putDecimal(beginWcThmM3,wcThmM3,WC_THM_M_3_LEN,WC_THM_M_3_SCALE,true);
		 localWcThmM3Counter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcThmM3MaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcThmM3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcThmM3() throws CFException {	
   	try { 
		 return (getDecimal(beginWcThmM3,WC_THM_M_3_LEN,WC_THM_M_3_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcThmM3", beginWcThmM3,WC_THM_M_3_LEN);
     }
   	}
        int localWcThmUsgCounter = -1;
        public boolean isWcThmUsgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcThmUsgCounter != sharedCounter;
           localWcThmUsgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcThmUsgIsNumeric() {
	      return decimalIsNumeric(beginWcThmUsg,WC_THM_USG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcThmUsgString() {
            return getPackedString(beginWcThmUsg,WC_THM_USG_LEN);
         }
   protected static final int WC_THM_USG_LEN = 9;
   protected static final int WC_THM_USG_SCALE = 4;
  	/**
	 * 	serializeWcThmUsg
	 */
	protected void serializeWcThmUsg(BigDecimal wcThmUsg) {
		   putDecimal(beginWcThmUsg,wcThmUsg,WC_THM_USG_LEN,WC_THM_USG_SCALE,true);
		 localWcThmUsgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcThmUsgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcThmUsg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcThmUsg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcThmUsg,WC_THM_USG_LEN,WC_THM_USG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcThmUsg", beginWcThmUsg,WC_THM_USG_LEN);
     }
   	}
        int localWcThmUkgCounter = -1;
        public boolean isWcThmUkgModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcThmUkgCounter != sharedCounter;
           localWcThmUkgCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcThmUkgIsNumeric() {
	      return decimalIsNumeric(beginWcThmUkg,WC_THM_UKG_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcThmUkgString() {
            return getPackedString(beginWcThmUkg,WC_THM_UKG_LEN);
         }
   protected static final int WC_THM_UKG_LEN = 9;
   protected static final int WC_THM_UKG_SCALE = 4;
  	/**
	 * 	serializeWcThmUkg
	 */
	protected void serializeWcThmUkg(BigDecimal wcThmUkg) {
		   putDecimal(beginWcThmUkg,wcThmUkg,WC_THM_UKG_LEN,WC_THM_UKG_SCALE,true);
		 localWcThmUkgCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcThmUkgMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcThmUkg is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcThmUkg() throws CFException {	
   	try { 
		 return (getDecimal(beginWcThmUkg,WC_THM_UKG_LEN,WC_THM_UKG_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcThmUkg", beginWcThmUkg,WC_THM_UKG_LEN);
     }
   	}
        int localWcThmMmbCounter = -1;
        public boolean isWcThmMmbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcThmMmbCounter != sharedCounter;
           localWcThmMmbCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcThmMmbIsNumeric() {
	      return decimalIsNumeric(beginWcThmMmb,WC_THM_MMB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcThmMmbString() {
            return getPackedString(beginWcThmMmb,WC_THM_MMB_LEN);
         }
   protected static final int WC_THM_MMB_LEN = 9;
   protected static final int WC_THM_MMB_SCALE = 4;
  	/**
	 * 	serializeWcThmMmb
	 */
	protected void serializeWcThmMmb(BigDecimal wcThmMmb) {
		   putDecimal(beginWcThmMmb,wcThmMmb,WC_THM_MMB_LEN,WC_THM_MMB_SCALE,true);
		 localWcThmMmbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcThmMmbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcThmMmb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcThmMmb() throws CFException {	
   	try { 
		 return (getDecimal(beginWcThmMmb,WC_THM_MMB_LEN,WC_THM_MMB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcThmMmb", beginWcThmMmb,WC_THM_MMB_LEN);
     }
   	}
        int localWcThmGbtCounter = -1;
        public boolean isWcThmGbtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcThmGbtCounter != sharedCounter;
           localWcThmGbtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcThmGbtIsNumeric() {
	      return decimalIsNumeric(beginWcThmGbt,WC_THM_GBT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcThmGbtString() {
            return getPackedString(beginWcThmGbt,WC_THM_GBT_LEN);
         }
   protected static final int WC_THM_GBT_LEN = 9;
   protected static final int WC_THM_GBT_SCALE = 4;
  	/**
	 * 	serializeWcThmGbt
	 */
	protected void serializeWcThmGbt(BigDecimal wcThmGbt) {
		   putDecimal(beginWcThmGbt,wcThmGbt,WC_THM_GBT_LEN,WC_THM_GBT_SCALE,true);
		 localWcThmGbtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcThmGbtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcThmGbt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcThmGbt() throws CFException {	
   	try { 
		 return (getDecimal(beginWcThmGbt,WC_THM_GBT_LEN,WC_THM_GBT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcThmGbt", beginWcThmGbt,WC_THM_GBT_LEN);
     }
   	}
        int localWcThmThmCounter = -1;
        public boolean isWcThmThmModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcThmThmCounter != sharedCounter;
           localWcThmThmCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcThmThmIsNumeric() {
	      return decimalIsNumeric(beginWcThmThm,WC_THM_THM_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcThmThmString() {
            return getPackedString(beginWcThmThm,WC_THM_THM_LEN);
         }
   protected static final int WC_THM_THM_LEN = 9;
   protected static final int WC_THM_THM_SCALE = 4;
  	/**
	 * 	serializeWcThmThm
	 */
	protected void serializeWcThmThm(BigDecimal wcThmThm) {
		   putDecimal(beginWcThmThm,wcThmThm,WC_THM_THM_LEN,WC_THM_THM_SCALE,true);
		 localWcThmThmCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcThmThmMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcThmThm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcThmThm() throws CFException {	
   	try { 
		 return (getDecimal(beginWcThmThm,WC_THM_THM_LEN,WC_THM_THM_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcThmThm", beginWcThmThm,WC_THM_THM_LEN);
     }
   	}
        int localWcThmMwhCounter = -1;
        public boolean isWcThmMwhModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcThmMwhCounter != sharedCounter;
           localWcThmMwhCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcThmMwhIsNumeric() {
	      return decimalIsNumeric(beginWcThmMwh,WC_THM_MWH_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcThmMwhString() {
            return getPackedString(beginWcThmMwh,WC_THM_MWH_LEN);
         }
   protected static final int WC_THM_MWH_LEN = 9;
   protected static final int WC_THM_MWH_SCALE = 4;
  	/**
	 * 	serializeWcThmMwh
	 */
	protected void serializeWcThmMwh(BigDecimal wcThmMwh) {
		   putDecimal(beginWcThmMwh,wcThmMwh,WC_THM_MWH_LEN,WC_THM_MWH_SCALE,true);
		 localWcThmMwhCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcThmMwhMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcThmMwh is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcThmMwh() throws CFException {	
   	try { 
		 return (getDecimal(beginWcThmMwh,WC_THM_MWH_LEN,WC_THM_MWH_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcThmMwh", beginWcThmMwh,WC_THM_MWH_LEN);
     }
   	}
        int localWcThmGjCounter = -1;
        public boolean isWcThmGjModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcThmGjCounter != sharedCounter;
           localWcThmGjCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcThmGjIsNumeric() {
	      return decimalIsNumeric(beginWcThmGj,WC_THM_GJ_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcThmGjString() {
            return getPackedString(beginWcThmGj,WC_THM_GJ_LEN);
         }
   protected static final int WC_THM_GJ_LEN = 9;
   protected static final int WC_THM_GJ_SCALE = 4;
  	/**
	 * 	serializeWcThmGj
	 */
	protected void serializeWcThmGj(BigDecimal wcThmGj) {
		   putDecimal(beginWcThmGj,wcThmGj,WC_THM_GJ_LEN,WC_THM_GJ_SCALE,true);
		 localWcThmGjCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcThmGjMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcThmGj is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcThmGj() throws CFException {	
   	try { 
		 return (getDecimal(beginWcThmGj,WC_THM_GJ_LEN,WC_THM_GJ_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcThmGj", beginWcThmGj,WC_THM_GJ_LEN);
     }
   	}
        int localWcThmDayCounter = -1;
        public boolean isWcThmDayModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWcThmDayCounter != sharedCounter;
           localWcThmDayCounter = sharedCounter; return hasModified; 
        }
	    public boolean wcThmDayIsNumeric() {
	      return decimalIsNumeric(beginWcThmDay,WC_THM_DAY_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wcThmDayString() {
            return getPackedString(beginWcThmDay,WC_THM_DAY_LEN);
         }
   protected static final int WC_THM_DAY_LEN = 9;
   protected static final int WC_THM_DAY_SCALE = 4;
  	/**
	 * 	serializeWcThmDay
	 */
	protected void serializeWcThmDay(BigDecimal wcThmDay) {
		   putDecimal(beginWcThmDay,wcThmDay,WC_THM_DAY_LEN,WC_THM_DAY_SCALE,true);
		 localWcThmDayCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWcThmDayMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,4/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshWcThmDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcThmDay() throws CFException {	
   	try { 
		 return (getDecimal(beginWcThmDay,WC_THM_DAY_LEN,WC_THM_DAY_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wcThmDay", beginWcThmDay,WC_THM_DAY_LEN);
     }
   	}




}
  
