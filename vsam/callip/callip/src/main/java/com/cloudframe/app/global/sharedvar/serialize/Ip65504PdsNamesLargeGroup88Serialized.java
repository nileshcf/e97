package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup88Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup88Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup88Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_88_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2698S;
            protected  int beginIp65504P2698L;
            protected  int beginIp65504P2699S;
            protected  int beginIp65504P2699L;
            protected  int beginIp65504P2700S;
            protected  int beginIp65504P2700L;
            protected  int beginIp65504P2701S;
            protected  int beginIp65504P2701L;
            protected  int beginIp65504P2702S;
            protected  int beginIp65504P2702L;
            protected  int beginIp65504P2703S;
            protected  int beginIp65504P2703L;
            protected  int beginIp65504P2704S;
            protected  int beginIp65504P2704L;
            protected  int beginIp65504P2705S;
            protected  int beginIp65504P2705L;
            protected  int beginIp65504P2706S;
            protected  int beginIp65504P2706L;
            protected  int beginIp65504P2707S;
            protected  int beginIp65504P2707L;
            protected  int beginIp65504P2708S;
            protected  int beginIp65504P2708L;
            protected  int beginIp65504P2709S;
            protected  int beginIp65504P2709L;
            protected  int beginIp65504P2710S;
            protected  int beginIp65504P2710L;
            protected  int beginIp65504P2711S;
            protected  int beginIp65504P2711L;
            protected  int beginIp65504P2712S;
            protected  int beginIp65504P2712L;
            protected  int beginIp65504P2713S;
            protected  int beginIp65504P2713L;
            protected  int beginIp65504P2714S;
            protected  int beginIp65504P2714L;
            protected  int beginIp65504P2715S;
            protected  int beginIp65504P2715L;
            protected  int beginIp65504P2716S;
            protected  int beginIp65504P2716L;
            protected  int beginIp65504P2717S;
            protected  int beginIp65504P2717L;
            protected  int beginIp65504P2718S;
            protected  int beginIp65504P2718L;
            protected  int beginIp65504P2719S;
            protected  int beginIp65504P2719L;
            protected  int beginIp65504P2720S;
            protected  int beginIp65504P2720L;
            protected  int beginIp65504P2721S;
            protected  int beginIp65504P2721L;
            protected  int beginIp65504P2722S;
            protected  int beginIp65504P2722L;
            protected  int beginIp65504P2723S;
            protected  int beginIp65504P2723L;
            protected  int beginIp65504P2724S;
            protected  int beginIp65504P2724L;
            protected  int beginIp65504P2725S;
            protected  int beginIp65504P2725L;
            protected  int beginIp65504P2726S;
            protected  int beginIp65504P2726L;
            protected  int beginIp65504P2727S;
            protected  int beginIp65504P2727L;
            protected  int beginIp65504P2728S;
            protected  int beginIp65504P2728L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup88Serialized
	**/
    public Ip65504PdsNamesLargeGroup88Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup88Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup88Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup88Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,21572); // serialize this field at offset 21572 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup88Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 21572 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup88Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_88_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2698S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2698L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2699S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2699L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2700S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2700L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2701S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2701L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2702S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2702L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2703S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2703L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2704S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2704L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2705S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2705L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2706S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2706L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2707S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2707L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2708S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2708L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2709S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2709L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2710S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2710L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2711S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2711L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2712S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2712L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2713S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2713L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2714S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2714L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2715S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2715L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2716S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2716L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2717S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2717L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2718S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2718L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2719S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2719L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2720S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2720L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2721S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2721L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2722S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2722L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2723S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2723L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2724S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2724L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2725S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2725L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2726S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2726L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2727S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2727L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2728S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2728L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2698SCounter = -1;
         public boolean isIp65504P2698SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2698SCounter != sharedCounter;
            localIp65504P2698SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2698_S_LEN = 2;
  	/**
	 * serializeIp65504P2698S
	 */
	protected void serializeIp65504P2698S(short ip65504P2698S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2698S,IP_65504_P_2698_S_LEN)
                  ,beginIp65504P2698S
                  ,IP_65504_P_2698_S_LEN
                 );
            localIp65504P2698SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2698SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2698S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2698S() {	 
			return (getShort(beginIp65504P2698S));
   	}
         int localIp65504P2698LCounter = -1;
         public boolean isIp65504P2698LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2698LCounter != sharedCounter;
            localIp65504P2698LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2698_L_LEN = 2;
  	/**
	 * serializeIp65504P2698L
	 */
	protected void serializeIp65504P2698L(short ip65504P2698L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2698L,IP_65504_P_2698_L_LEN)
                  ,beginIp65504P2698L
                  ,IP_65504_P_2698_L_LEN
                 );
            localIp65504P2698LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2698LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2698L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2698L() {	 
			return (getShort(beginIp65504P2698L));
   	}
         int localIp65504P2699SCounter = -1;
         public boolean isIp65504P2699SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2699SCounter != sharedCounter;
            localIp65504P2699SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2699_S_LEN = 2;
  	/**
	 * serializeIp65504P2699S
	 */
	protected void serializeIp65504P2699S(short ip65504P2699S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2699S,IP_65504_P_2699_S_LEN)
                  ,beginIp65504P2699S
                  ,IP_65504_P_2699_S_LEN
                 );
            localIp65504P2699SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2699SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2699S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2699S() {	 
			return (getShort(beginIp65504P2699S));
   	}
         int localIp65504P2699LCounter = -1;
         public boolean isIp65504P2699LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2699LCounter != sharedCounter;
            localIp65504P2699LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2699_L_LEN = 2;
  	/**
	 * serializeIp65504P2699L
	 */
	protected void serializeIp65504P2699L(short ip65504P2699L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2699L,IP_65504_P_2699_L_LEN)
                  ,beginIp65504P2699L
                  ,IP_65504_P_2699_L_LEN
                 );
            localIp65504P2699LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2699LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2699L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2699L() {	 
			return (getShort(beginIp65504P2699L));
   	}
         int localIp65504P2700SCounter = -1;
         public boolean isIp65504P2700SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2700SCounter != sharedCounter;
            localIp65504P2700SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2700_S_LEN = 2;
  	/**
	 * serializeIp65504P2700S
	 */
	protected void serializeIp65504P2700S(short ip65504P2700S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2700S,IP_65504_P_2700_S_LEN)
                  ,beginIp65504P2700S
                  ,IP_65504_P_2700_S_LEN
                 );
            localIp65504P2700SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2700SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2700S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2700S() {	 
			return (getShort(beginIp65504P2700S));
   	}
         int localIp65504P2700LCounter = -1;
         public boolean isIp65504P2700LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2700LCounter != sharedCounter;
            localIp65504P2700LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2700_L_LEN = 2;
  	/**
	 * serializeIp65504P2700L
	 */
	protected void serializeIp65504P2700L(short ip65504P2700L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2700L,IP_65504_P_2700_L_LEN)
                  ,beginIp65504P2700L
                  ,IP_65504_P_2700_L_LEN
                 );
            localIp65504P2700LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2700LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2700L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2700L() {	 
			return (getShort(beginIp65504P2700L));
   	}
         int localIp65504P2701SCounter = -1;
         public boolean isIp65504P2701SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2701SCounter != sharedCounter;
            localIp65504P2701SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2701_S_LEN = 2;
  	/**
	 * serializeIp65504P2701S
	 */
	protected void serializeIp65504P2701S(short ip65504P2701S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2701S,IP_65504_P_2701_S_LEN)
                  ,beginIp65504P2701S
                  ,IP_65504_P_2701_S_LEN
                 );
            localIp65504P2701SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2701SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2701S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2701S() {	 
			return (getShort(beginIp65504P2701S));
   	}
         int localIp65504P2701LCounter = -1;
         public boolean isIp65504P2701LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2701LCounter != sharedCounter;
            localIp65504P2701LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2701_L_LEN = 2;
  	/**
	 * serializeIp65504P2701L
	 */
	protected void serializeIp65504P2701L(short ip65504P2701L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2701L,IP_65504_P_2701_L_LEN)
                  ,beginIp65504P2701L
                  ,IP_65504_P_2701_L_LEN
                 );
            localIp65504P2701LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2701LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2701L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2701L() {	 
			return (getShort(beginIp65504P2701L));
   	}
         int localIp65504P2702SCounter = -1;
         public boolean isIp65504P2702SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2702SCounter != sharedCounter;
            localIp65504P2702SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2702_S_LEN = 2;
  	/**
	 * serializeIp65504P2702S
	 */
	protected void serializeIp65504P2702S(short ip65504P2702S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2702S,IP_65504_P_2702_S_LEN)
                  ,beginIp65504P2702S
                  ,IP_65504_P_2702_S_LEN
                 );
            localIp65504P2702SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2702SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2702S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2702S() {	 
			return (getShort(beginIp65504P2702S));
   	}
         int localIp65504P2702LCounter = -1;
         public boolean isIp65504P2702LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2702LCounter != sharedCounter;
            localIp65504P2702LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2702_L_LEN = 2;
  	/**
	 * serializeIp65504P2702L
	 */
	protected void serializeIp65504P2702L(short ip65504P2702L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2702L,IP_65504_P_2702_L_LEN)
                  ,beginIp65504P2702L
                  ,IP_65504_P_2702_L_LEN
                 );
            localIp65504P2702LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2702LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2702L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2702L() {	 
			return (getShort(beginIp65504P2702L));
   	}
         int localIp65504P2703SCounter = -1;
         public boolean isIp65504P2703SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2703SCounter != sharedCounter;
            localIp65504P2703SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2703_S_LEN = 2;
  	/**
	 * serializeIp65504P2703S
	 */
	protected void serializeIp65504P2703S(short ip65504P2703S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2703S,IP_65504_P_2703_S_LEN)
                  ,beginIp65504P2703S
                  ,IP_65504_P_2703_S_LEN
                 );
            localIp65504P2703SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2703SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2703S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2703S() {	 
			return (getShort(beginIp65504P2703S));
   	}
         int localIp65504P2703LCounter = -1;
         public boolean isIp65504P2703LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2703LCounter != sharedCounter;
            localIp65504P2703LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2703_L_LEN = 2;
  	/**
	 * serializeIp65504P2703L
	 */
	protected void serializeIp65504P2703L(short ip65504P2703L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2703L,IP_65504_P_2703_L_LEN)
                  ,beginIp65504P2703L
                  ,IP_65504_P_2703_L_LEN
                 );
            localIp65504P2703LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2703LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2703L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2703L() {	 
			return (getShort(beginIp65504P2703L));
   	}
         int localIp65504P2704SCounter = -1;
         public boolean isIp65504P2704SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2704SCounter != sharedCounter;
            localIp65504P2704SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2704_S_LEN = 2;
  	/**
	 * serializeIp65504P2704S
	 */
	protected void serializeIp65504P2704S(short ip65504P2704S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2704S,IP_65504_P_2704_S_LEN)
                  ,beginIp65504P2704S
                  ,IP_65504_P_2704_S_LEN
                 );
            localIp65504P2704SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2704SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2704S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2704S() {	 
			return (getShort(beginIp65504P2704S));
   	}
         int localIp65504P2704LCounter = -1;
         public boolean isIp65504P2704LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2704LCounter != sharedCounter;
            localIp65504P2704LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2704_L_LEN = 2;
  	/**
	 * serializeIp65504P2704L
	 */
	protected void serializeIp65504P2704L(short ip65504P2704L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2704L,IP_65504_P_2704_L_LEN)
                  ,beginIp65504P2704L
                  ,IP_65504_P_2704_L_LEN
                 );
            localIp65504P2704LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2704LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2704L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2704L() {	 
			return (getShort(beginIp65504P2704L));
   	}
         int localIp65504P2705SCounter = -1;
         public boolean isIp65504P2705SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2705SCounter != sharedCounter;
            localIp65504P2705SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2705_S_LEN = 2;
  	/**
	 * serializeIp65504P2705S
	 */
	protected void serializeIp65504P2705S(short ip65504P2705S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2705S,IP_65504_P_2705_S_LEN)
                  ,beginIp65504P2705S
                  ,IP_65504_P_2705_S_LEN
                 );
            localIp65504P2705SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2705SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2705S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2705S() {	 
			return (getShort(beginIp65504P2705S));
   	}
         int localIp65504P2705LCounter = -1;
         public boolean isIp65504P2705LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2705LCounter != sharedCounter;
            localIp65504P2705LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2705_L_LEN = 2;
  	/**
	 * serializeIp65504P2705L
	 */
	protected void serializeIp65504P2705L(short ip65504P2705L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2705L,IP_65504_P_2705_L_LEN)
                  ,beginIp65504P2705L
                  ,IP_65504_P_2705_L_LEN
                 );
            localIp65504P2705LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2705LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2705L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2705L() {	 
			return (getShort(beginIp65504P2705L));
   	}
         int localIp65504P2706SCounter = -1;
         public boolean isIp65504P2706SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2706SCounter != sharedCounter;
            localIp65504P2706SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2706_S_LEN = 2;
  	/**
	 * serializeIp65504P2706S
	 */
	protected void serializeIp65504P2706S(short ip65504P2706S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2706S,IP_65504_P_2706_S_LEN)
                  ,beginIp65504P2706S
                  ,IP_65504_P_2706_S_LEN
                 );
            localIp65504P2706SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2706SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2706S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2706S() {	 
			return (getShort(beginIp65504P2706S));
   	}
         int localIp65504P2706LCounter = -1;
         public boolean isIp65504P2706LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2706LCounter != sharedCounter;
            localIp65504P2706LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2706_L_LEN = 2;
  	/**
	 * serializeIp65504P2706L
	 */
	protected void serializeIp65504P2706L(short ip65504P2706L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2706L,IP_65504_P_2706_L_LEN)
                  ,beginIp65504P2706L
                  ,IP_65504_P_2706_L_LEN
                 );
            localIp65504P2706LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2706LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2706L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2706L() {	 
			return (getShort(beginIp65504P2706L));
   	}
         int localIp65504P2707SCounter = -1;
         public boolean isIp65504P2707SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2707SCounter != sharedCounter;
            localIp65504P2707SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2707_S_LEN = 2;
  	/**
	 * serializeIp65504P2707S
	 */
	protected void serializeIp65504P2707S(short ip65504P2707S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2707S,IP_65504_P_2707_S_LEN)
                  ,beginIp65504P2707S
                  ,IP_65504_P_2707_S_LEN
                 );
            localIp65504P2707SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2707SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2707S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2707S() {	 
			return (getShort(beginIp65504P2707S));
   	}
         int localIp65504P2707LCounter = -1;
         public boolean isIp65504P2707LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2707LCounter != sharedCounter;
            localIp65504P2707LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2707_L_LEN = 2;
  	/**
	 * serializeIp65504P2707L
	 */
	protected void serializeIp65504P2707L(short ip65504P2707L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2707L,IP_65504_P_2707_L_LEN)
                  ,beginIp65504P2707L
                  ,IP_65504_P_2707_L_LEN
                 );
            localIp65504P2707LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2707LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2707L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2707L() {	 
			return (getShort(beginIp65504P2707L));
   	}
         int localIp65504P2708SCounter = -1;
         public boolean isIp65504P2708SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2708SCounter != sharedCounter;
            localIp65504P2708SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2708_S_LEN = 2;
  	/**
	 * serializeIp65504P2708S
	 */
	protected void serializeIp65504P2708S(short ip65504P2708S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2708S,IP_65504_P_2708_S_LEN)
                  ,beginIp65504P2708S
                  ,IP_65504_P_2708_S_LEN
                 );
            localIp65504P2708SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2708SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2708S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2708S() {	 
			return (getShort(beginIp65504P2708S));
   	}
         int localIp65504P2708LCounter = -1;
         public boolean isIp65504P2708LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2708LCounter != sharedCounter;
            localIp65504P2708LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2708_L_LEN = 2;
  	/**
	 * serializeIp65504P2708L
	 */
	protected void serializeIp65504P2708L(short ip65504P2708L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2708L,IP_65504_P_2708_L_LEN)
                  ,beginIp65504P2708L
                  ,IP_65504_P_2708_L_LEN
                 );
            localIp65504P2708LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2708LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2708L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2708L() {	 
			return (getShort(beginIp65504P2708L));
   	}
         int localIp65504P2709SCounter = -1;
         public boolean isIp65504P2709SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2709SCounter != sharedCounter;
            localIp65504P2709SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2709_S_LEN = 2;
  	/**
	 * serializeIp65504P2709S
	 */
	protected void serializeIp65504P2709S(short ip65504P2709S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2709S,IP_65504_P_2709_S_LEN)
                  ,beginIp65504P2709S
                  ,IP_65504_P_2709_S_LEN
                 );
            localIp65504P2709SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2709SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2709S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2709S() {	 
			return (getShort(beginIp65504P2709S));
   	}
         int localIp65504P2709LCounter = -1;
         public boolean isIp65504P2709LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2709LCounter != sharedCounter;
            localIp65504P2709LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2709_L_LEN = 2;
  	/**
	 * serializeIp65504P2709L
	 */
	protected void serializeIp65504P2709L(short ip65504P2709L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2709L,IP_65504_P_2709_L_LEN)
                  ,beginIp65504P2709L
                  ,IP_65504_P_2709_L_LEN
                 );
            localIp65504P2709LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2709LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2709L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2709L() {	 
			return (getShort(beginIp65504P2709L));
   	}
         int localIp65504P2710SCounter = -1;
         public boolean isIp65504P2710SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2710SCounter != sharedCounter;
            localIp65504P2710SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2710_S_LEN = 2;
  	/**
	 * serializeIp65504P2710S
	 */
	protected void serializeIp65504P2710S(short ip65504P2710S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2710S,IP_65504_P_2710_S_LEN)
                  ,beginIp65504P2710S
                  ,IP_65504_P_2710_S_LEN
                 );
            localIp65504P2710SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2710SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2710S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2710S() {	 
			return (getShort(beginIp65504P2710S));
   	}
         int localIp65504P2710LCounter = -1;
         public boolean isIp65504P2710LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2710LCounter != sharedCounter;
            localIp65504P2710LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2710_L_LEN = 2;
  	/**
	 * serializeIp65504P2710L
	 */
	protected void serializeIp65504P2710L(short ip65504P2710L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2710L,IP_65504_P_2710_L_LEN)
                  ,beginIp65504P2710L
                  ,IP_65504_P_2710_L_LEN
                 );
            localIp65504P2710LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2710LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2710L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2710L() {	 
			return (getShort(beginIp65504P2710L));
   	}
         int localIp65504P2711SCounter = -1;
         public boolean isIp65504P2711SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2711SCounter != sharedCounter;
            localIp65504P2711SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2711_S_LEN = 2;
  	/**
	 * serializeIp65504P2711S
	 */
	protected void serializeIp65504P2711S(short ip65504P2711S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2711S,IP_65504_P_2711_S_LEN)
                  ,beginIp65504P2711S
                  ,IP_65504_P_2711_S_LEN
                 );
            localIp65504P2711SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2711SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2711S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2711S() {	 
			return (getShort(beginIp65504P2711S));
   	}
         int localIp65504P2711LCounter = -1;
         public boolean isIp65504P2711LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2711LCounter != sharedCounter;
            localIp65504P2711LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2711_L_LEN = 2;
  	/**
	 * serializeIp65504P2711L
	 */
	protected void serializeIp65504P2711L(short ip65504P2711L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2711L,IP_65504_P_2711_L_LEN)
                  ,beginIp65504P2711L
                  ,IP_65504_P_2711_L_LEN
                 );
            localIp65504P2711LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2711LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2711L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2711L() {	 
			return (getShort(beginIp65504P2711L));
   	}
         int localIp65504P2712SCounter = -1;
         public boolean isIp65504P2712SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2712SCounter != sharedCounter;
            localIp65504P2712SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2712_S_LEN = 2;
  	/**
	 * serializeIp65504P2712S
	 */
	protected void serializeIp65504P2712S(short ip65504P2712S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2712S,IP_65504_P_2712_S_LEN)
                  ,beginIp65504P2712S
                  ,IP_65504_P_2712_S_LEN
                 );
            localIp65504P2712SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2712SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2712S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2712S() {	 
			return (getShort(beginIp65504P2712S));
   	}
         int localIp65504P2712LCounter = -1;
         public boolean isIp65504P2712LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2712LCounter != sharedCounter;
            localIp65504P2712LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2712_L_LEN = 2;
  	/**
	 * serializeIp65504P2712L
	 */
	protected void serializeIp65504P2712L(short ip65504P2712L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2712L,IP_65504_P_2712_L_LEN)
                  ,beginIp65504P2712L
                  ,IP_65504_P_2712_L_LEN
                 );
            localIp65504P2712LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2712LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2712L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2712L() {	 
			return (getShort(beginIp65504P2712L));
   	}
         int localIp65504P2713SCounter = -1;
         public boolean isIp65504P2713SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2713SCounter != sharedCounter;
            localIp65504P2713SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2713_S_LEN = 2;
  	/**
	 * serializeIp65504P2713S
	 */
	protected void serializeIp65504P2713S(short ip65504P2713S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2713S,IP_65504_P_2713_S_LEN)
                  ,beginIp65504P2713S
                  ,IP_65504_P_2713_S_LEN
                 );
            localIp65504P2713SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2713SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2713S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2713S() {	 
			return (getShort(beginIp65504P2713S));
   	}
         int localIp65504P2713LCounter = -1;
         public boolean isIp65504P2713LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2713LCounter != sharedCounter;
            localIp65504P2713LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2713_L_LEN = 2;
  	/**
	 * serializeIp65504P2713L
	 */
	protected void serializeIp65504P2713L(short ip65504P2713L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2713L,IP_65504_P_2713_L_LEN)
                  ,beginIp65504P2713L
                  ,IP_65504_P_2713_L_LEN
                 );
            localIp65504P2713LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2713LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2713L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2713L() {	 
			return (getShort(beginIp65504P2713L));
   	}
         int localIp65504P2714SCounter = -1;
         public boolean isIp65504P2714SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2714SCounter != sharedCounter;
            localIp65504P2714SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2714_S_LEN = 2;
  	/**
	 * serializeIp65504P2714S
	 */
	protected void serializeIp65504P2714S(short ip65504P2714S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2714S,IP_65504_P_2714_S_LEN)
                  ,beginIp65504P2714S
                  ,IP_65504_P_2714_S_LEN
                 );
            localIp65504P2714SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2714SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2714S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2714S() {	 
			return (getShort(beginIp65504P2714S));
   	}
         int localIp65504P2714LCounter = -1;
         public boolean isIp65504P2714LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2714LCounter != sharedCounter;
            localIp65504P2714LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2714_L_LEN = 2;
  	/**
	 * serializeIp65504P2714L
	 */
	protected void serializeIp65504P2714L(short ip65504P2714L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2714L,IP_65504_P_2714_L_LEN)
                  ,beginIp65504P2714L
                  ,IP_65504_P_2714_L_LEN
                 );
            localIp65504P2714LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2714LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2714L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2714L() {	 
			return (getShort(beginIp65504P2714L));
   	}
         int localIp65504P2715SCounter = -1;
         public boolean isIp65504P2715SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2715SCounter != sharedCounter;
            localIp65504P2715SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2715_S_LEN = 2;
  	/**
	 * serializeIp65504P2715S
	 */
	protected void serializeIp65504P2715S(short ip65504P2715S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2715S,IP_65504_P_2715_S_LEN)
                  ,beginIp65504P2715S
                  ,IP_65504_P_2715_S_LEN
                 );
            localIp65504P2715SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2715SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2715S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2715S() {	 
			return (getShort(beginIp65504P2715S));
   	}
         int localIp65504P2715LCounter = -1;
         public boolean isIp65504P2715LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2715LCounter != sharedCounter;
            localIp65504P2715LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2715_L_LEN = 2;
  	/**
	 * serializeIp65504P2715L
	 */
	protected void serializeIp65504P2715L(short ip65504P2715L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2715L,IP_65504_P_2715_L_LEN)
                  ,beginIp65504P2715L
                  ,IP_65504_P_2715_L_LEN
                 );
            localIp65504P2715LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2715LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2715L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2715L() {	 
			return (getShort(beginIp65504P2715L));
   	}
         int localIp65504P2716SCounter = -1;
         public boolean isIp65504P2716SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2716SCounter != sharedCounter;
            localIp65504P2716SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2716_S_LEN = 2;
  	/**
	 * serializeIp65504P2716S
	 */
	protected void serializeIp65504P2716S(short ip65504P2716S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2716S,IP_65504_P_2716_S_LEN)
                  ,beginIp65504P2716S
                  ,IP_65504_P_2716_S_LEN
                 );
            localIp65504P2716SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2716SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2716S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2716S() {	 
			return (getShort(beginIp65504P2716S));
   	}
         int localIp65504P2716LCounter = -1;
         public boolean isIp65504P2716LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2716LCounter != sharedCounter;
            localIp65504P2716LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2716_L_LEN = 2;
  	/**
	 * serializeIp65504P2716L
	 */
	protected void serializeIp65504P2716L(short ip65504P2716L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2716L,IP_65504_P_2716_L_LEN)
                  ,beginIp65504P2716L
                  ,IP_65504_P_2716_L_LEN
                 );
            localIp65504P2716LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2716LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2716L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2716L() {	 
			return (getShort(beginIp65504P2716L));
   	}
         int localIp65504P2717SCounter = -1;
         public boolean isIp65504P2717SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2717SCounter != sharedCounter;
            localIp65504P2717SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2717_S_LEN = 2;
  	/**
	 * serializeIp65504P2717S
	 */
	protected void serializeIp65504P2717S(short ip65504P2717S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2717S,IP_65504_P_2717_S_LEN)
                  ,beginIp65504P2717S
                  ,IP_65504_P_2717_S_LEN
                 );
            localIp65504P2717SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2717SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2717S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2717S() {	 
			return (getShort(beginIp65504P2717S));
   	}
         int localIp65504P2717LCounter = -1;
         public boolean isIp65504P2717LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2717LCounter != sharedCounter;
            localIp65504P2717LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2717_L_LEN = 2;
  	/**
	 * serializeIp65504P2717L
	 */
	protected void serializeIp65504P2717L(short ip65504P2717L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2717L,IP_65504_P_2717_L_LEN)
                  ,beginIp65504P2717L
                  ,IP_65504_P_2717_L_LEN
                 );
            localIp65504P2717LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2717LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2717L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2717L() {	 
			return (getShort(beginIp65504P2717L));
   	}
         int localIp65504P2718SCounter = -1;
         public boolean isIp65504P2718SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2718SCounter != sharedCounter;
            localIp65504P2718SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2718_S_LEN = 2;
  	/**
	 * serializeIp65504P2718S
	 */
	protected void serializeIp65504P2718S(short ip65504P2718S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2718S,IP_65504_P_2718_S_LEN)
                  ,beginIp65504P2718S
                  ,IP_65504_P_2718_S_LEN
                 );
            localIp65504P2718SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2718SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2718S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2718S() {	 
			return (getShort(beginIp65504P2718S));
   	}
         int localIp65504P2718LCounter = -1;
         public boolean isIp65504P2718LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2718LCounter != sharedCounter;
            localIp65504P2718LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2718_L_LEN = 2;
  	/**
	 * serializeIp65504P2718L
	 */
	protected void serializeIp65504P2718L(short ip65504P2718L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2718L,IP_65504_P_2718_L_LEN)
                  ,beginIp65504P2718L
                  ,IP_65504_P_2718_L_LEN
                 );
            localIp65504P2718LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2718LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2718L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2718L() {	 
			return (getShort(beginIp65504P2718L));
   	}
         int localIp65504P2719SCounter = -1;
         public boolean isIp65504P2719SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2719SCounter != sharedCounter;
            localIp65504P2719SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2719_S_LEN = 2;
  	/**
	 * serializeIp65504P2719S
	 */
	protected void serializeIp65504P2719S(short ip65504P2719S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2719S,IP_65504_P_2719_S_LEN)
                  ,beginIp65504P2719S
                  ,IP_65504_P_2719_S_LEN
                 );
            localIp65504P2719SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2719SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2719S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2719S() {	 
			return (getShort(beginIp65504P2719S));
   	}
         int localIp65504P2719LCounter = -1;
         public boolean isIp65504P2719LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2719LCounter != sharedCounter;
            localIp65504P2719LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2719_L_LEN = 2;
  	/**
	 * serializeIp65504P2719L
	 */
	protected void serializeIp65504P2719L(short ip65504P2719L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2719L,IP_65504_P_2719_L_LEN)
                  ,beginIp65504P2719L
                  ,IP_65504_P_2719_L_LEN
                 );
            localIp65504P2719LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2719LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2719L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2719L() {	 
			return (getShort(beginIp65504P2719L));
   	}
         int localIp65504P2720SCounter = -1;
         public boolean isIp65504P2720SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2720SCounter != sharedCounter;
            localIp65504P2720SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2720_S_LEN = 2;
  	/**
	 * serializeIp65504P2720S
	 */
	protected void serializeIp65504P2720S(short ip65504P2720S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2720S,IP_65504_P_2720_S_LEN)
                  ,beginIp65504P2720S
                  ,IP_65504_P_2720_S_LEN
                 );
            localIp65504P2720SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2720SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2720S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2720S() {	 
			return (getShort(beginIp65504P2720S));
   	}
         int localIp65504P2720LCounter = -1;
         public boolean isIp65504P2720LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2720LCounter != sharedCounter;
            localIp65504P2720LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2720_L_LEN = 2;
  	/**
	 * serializeIp65504P2720L
	 */
	protected void serializeIp65504P2720L(short ip65504P2720L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2720L,IP_65504_P_2720_L_LEN)
                  ,beginIp65504P2720L
                  ,IP_65504_P_2720_L_LEN
                 );
            localIp65504P2720LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2720LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2720L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2720L() {	 
			return (getShort(beginIp65504P2720L));
   	}
         int localIp65504P2721SCounter = -1;
         public boolean isIp65504P2721SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2721SCounter != sharedCounter;
            localIp65504P2721SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2721_S_LEN = 2;
  	/**
	 * serializeIp65504P2721S
	 */
	protected void serializeIp65504P2721S(short ip65504P2721S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2721S,IP_65504_P_2721_S_LEN)
                  ,beginIp65504P2721S
                  ,IP_65504_P_2721_S_LEN
                 );
            localIp65504P2721SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2721SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2721S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2721S() {	 
			return (getShort(beginIp65504P2721S));
   	}
         int localIp65504P2721LCounter = -1;
         public boolean isIp65504P2721LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2721LCounter != sharedCounter;
            localIp65504P2721LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2721_L_LEN = 2;
  	/**
	 * serializeIp65504P2721L
	 */
	protected void serializeIp65504P2721L(short ip65504P2721L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2721L,IP_65504_P_2721_L_LEN)
                  ,beginIp65504P2721L
                  ,IP_65504_P_2721_L_LEN
                 );
            localIp65504P2721LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2721LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2721L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2721L() {	 
			return (getShort(beginIp65504P2721L));
   	}
         int localIp65504P2722SCounter = -1;
         public boolean isIp65504P2722SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2722SCounter != sharedCounter;
            localIp65504P2722SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2722_S_LEN = 2;
  	/**
	 * serializeIp65504P2722S
	 */
	protected void serializeIp65504P2722S(short ip65504P2722S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2722S,IP_65504_P_2722_S_LEN)
                  ,beginIp65504P2722S
                  ,IP_65504_P_2722_S_LEN
                 );
            localIp65504P2722SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2722SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2722S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2722S() {	 
			return (getShort(beginIp65504P2722S));
   	}
         int localIp65504P2722LCounter = -1;
         public boolean isIp65504P2722LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2722LCounter != sharedCounter;
            localIp65504P2722LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2722_L_LEN = 2;
  	/**
	 * serializeIp65504P2722L
	 */
	protected void serializeIp65504P2722L(short ip65504P2722L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2722L,IP_65504_P_2722_L_LEN)
                  ,beginIp65504P2722L
                  ,IP_65504_P_2722_L_LEN
                 );
            localIp65504P2722LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2722LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2722L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2722L() {	 
			return (getShort(beginIp65504P2722L));
   	}
         int localIp65504P2723SCounter = -1;
         public boolean isIp65504P2723SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2723SCounter != sharedCounter;
            localIp65504P2723SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2723_S_LEN = 2;
  	/**
	 * serializeIp65504P2723S
	 */
	protected void serializeIp65504P2723S(short ip65504P2723S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2723S,IP_65504_P_2723_S_LEN)
                  ,beginIp65504P2723S
                  ,IP_65504_P_2723_S_LEN
                 );
            localIp65504P2723SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2723SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2723S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2723S() {	 
			return (getShort(beginIp65504P2723S));
   	}
         int localIp65504P2723LCounter = -1;
         public boolean isIp65504P2723LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2723LCounter != sharedCounter;
            localIp65504P2723LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2723_L_LEN = 2;
  	/**
	 * serializeIp65504P2723L
	 */
	protected void serializeIp65504P2723L(short ip65504P2723L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2723L,IP_65504_P_2723_L_LEN)
                  ,beginIp65504P2723L
                  ,IP_65504_P_2723_L_LEN
                 );
            localIp65504P2723LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2723LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2723L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2723L() {	 
			return (getShort(beginIp65504P2723L));
   	}
         int localIp65504P2724SCounter = -1;
         public boolean isIp65504P2724SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2724SCounter != sharedCounter;
            localIp65504P2724SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2724_S_LEN = 2;
  	/**
	 * serializeIp65504P2724S
	 */
	protected void serializeIp65504P2724S(short ip65504P2724S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2724S,IP_65504_P_2724_S_LEN)
                  ,beginIp65504P2724S
                  ,IP_65504_P_2724_S_LEN
                 );
            localIp65504P2724SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2724SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2724S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2724S() {	 
			return (getShort(beginIp65504P2724S));
   	}
         int localIp65504P2724LCounter = -1;
         public boolean isIp65504P2724LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2724LCounter != sharedCounter;
            localIp65504P2724LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2724_L_LEN = 2;
  	/**
	 * serializeIp65504P2724L
	 */
	protected void serializeIp65504P2724L(short ip65504P2724L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2724L,IP_65504_P_2724_L_LEN)
                  ,beginIp65504P2724L
                  ,IP_65504_P_2724_L_LEN
                 );
            localIp65504P2724LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2724LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2724L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2724L() {	 
			return (getShort(beginIp65504P2724L));
   	}
         int localIp65504P2725SCounter = -1;
         public boolean isIp65504P2725SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2725SCounter != sharedCounter;
            localIp65504P2725SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2725_S_LEN = 2;
  	/**
	 * serializeIp65504P2725S
	 */
	protected void serializeIp65504P2725S(short ip65504P2725S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2725S,IP_65504_P_2725_S_LEN)
                  ,beginIp65504P2725S
                  ,IP_65504_P_2725_S_LEN
                 );
            localIp65504P2725SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2725SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2725S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2725S() {	 
			return (getShort(beginIp65504P2725S));
   	}
         int localIp65504P2725LCounter = -1;
         public boolean isIp65504P2725LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2725LCounter != sharedCounter;
            localIp65504P2725LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2725_L_LEN = 2;
  	/**
	 * serializeIp65504P2725L
	 */
	protected void serializeIp65504P2725L(short ip65504P2725L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2725L,IP_65504_P_2725_L_LEN)
                  ,beginIp65504P2725L
                  ,IP_65504_P_2725_L_LEN
                 );
            localIp65504P2725LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2725LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2725L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2725L() {	 
			return (getShort(beginIp65504P2725L));
   	}
         int localIp65504P2726SCounter = -1;
         public boolean isIp65504P2726SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2726SCounter != sharedCounter;
            localIp65504P2726SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2726_S_LEN = 2;
  	/**
	 * serializeIp65504P2726S
	 */
	protected void serializeIp65504P2726S(short ip65504P2726S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2726S,IP_65504_P_2726_S_LEN)
                  ,beginIp65504P2726S
                  ,IP_65504_P_2726_S_LEN
                 );
            localIp65504P2726SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2726SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2726S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2726S() {	 
			return (getShort(beginIp65504P2726S));
   	}
         int localIp65504P2726LCounter = -1;
         public boolean isIp65504P2726LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2726LCounter != sharedCounter;
            localIp65504P2726LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2726_L_LEN = 2;
  	/**
	 * serializeIp65504P2726L
	 */
	protected void serializeIp65504P2726L(short ip65504P2726L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2726L,IP_65504_P_2726_L_LEN)
                  ,beginIp65504P2726L
                  ,IP_65504_P_2726_L_LEN
                 );
            localIp65504P2726LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2726LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2726L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2726L() {	 
			return (getShort(beginIp65504P2726L));
   	}
         int localIp65504P2727SCounter = -1;
         public boolean isIp65504P2727SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2727SCounter != sharedCounter;
            localIp65504P2727SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2727_S_LEN = 2;
  	/**
	 * serializeIp65504P2727S
	 */
	protected void serializeIp65504P2727S(short ip65504P2727S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2727S,IP_65504_P_2727_S_LEN)
                  ,beginIp65504P2727S
                  ,IP_65504_P_2727_S_LEN
                 );
            localIp65504P2727SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2727SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2727S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2727S() {	 
			return (getShort(beginIp65504P2727S));
   	}
         int localIp65504P2727LCounter = -1;
         public boolean isIp65504P2727LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2727LCounter != sharedCounter;
            localIp65504P2727LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2727_L_LEN = 2;
  	/**
	 * serializeIp65504P2727L
	 */
	protected void serializeIp65504P2727L(short ip65504P2727L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2727L,IP_65504_P_2727_L_LEN)
                  ,beginIp65504P2727L
                  ,IP_65504_P_2727_L_LEN
                 );
            localIp65504P2727LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2727LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2727L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2727L() {	 
			return (getShort(beginIp65504P2727L));
   	}
         int localIp65504P2728SCounter = -1;
         public boolean isIp65504P2728SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2728SCounter != sharedCounter;
            localIp65504P2728SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2728_S_LEN = 2;
  	/**
	 * serializeIp65504P2728S
	 */
	protected void serializeIp65504P2728S(short ip65504P2728S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2728S,IP_65504_P_2728_S_LEN)
                  ,beginIp65504P2728S
                  ,IP_65504_P_2728_S_LEN
                 );
            localIp65504P2728SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2728SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2728S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2728S() {	 
			return (getShort(beginIp65504P2728S));
   	}
         int localIp65504P2728LCounter = -1;
         public boolean isIp65504P2728LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2728LCounter != sharedCounter;
            localIp65504P2728LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2728_L_LEN = 2;
  	/**
	 * serializeIp65504P2728L
	 */
	protected void serializeIp65504P2728L(short ip65504P2728L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2728L,IP_65504_P_2728_L_LEN)
                  ,beginIp65504P2728L
                  ,IP_65504_P_2728_L_LEN
                 );
            localIp65504P2728LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2728LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2728L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2728L() {	 
			return (getShort(beginIp65504P2728L));
   	}




}
  
