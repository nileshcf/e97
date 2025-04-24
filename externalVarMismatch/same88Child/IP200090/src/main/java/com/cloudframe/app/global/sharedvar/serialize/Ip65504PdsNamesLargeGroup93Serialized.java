package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup93Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup93Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup93Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_93_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2853S;
            protected  int beginIp65504P2853L;
            protected  int beginIp65504P2854S;
            protected  int beginIp65504P2854L;
            protected  int beginIp65504P2855S;
            protected  int beginIp65504P2855L;
            protected  int beginIp65504P2856S;
            protected  int beginIp65504P2856L;
            protected  int beginIp65504P2857S;
            protected  int beginIp65504P2857L;
            protected  int beginIp65504P2858S;
            protected  int beginIp65504P2858L;
            protected  int beginIp65504P2859S;
            protected  int beginIp65504P2859L;
            protected  int beginIp65504P2860S;
            protected  int beginIp65504P2860L;
            protected  int beginIp65504P2861S;
            protected  int beginIp65504P2861L;
            protected  int beginIp65504P2862S;
            protected  int beginIp65504P2862L;
            protected  int beginIp65504P2863S;
            protected  int beginIp65504P2863L;
            protected  int beginIp65504P2864S;
            protected  int beginIp65504P2864L;
            protected  int beginIp65504P2865S;
            protected  int beginIp65504P2865L;
            protected  int beginIp65504P2866S;
            protected  int beginIp65504P2866L;
            protected  int beginIp65504P2867S;
            protected  int beginIp65504P2867L;
            protected  int beginIp65504P2868S;
            protected  int beginIp65504P2868L;
            protected  int beginIp65504P2869S;
            protected  int beginIp65504P2869L;
            protected  int beginIp65504P2870S;
            protected  int beginIp65504P2870L;
            protected  int beginIp65504P2871S;
            protected  int beginIp65504P2871L;
            protected  int beginIp65504P2872S;
            protected  int beginIp65504P2872L;
            protected  int beginIp65504P2873S;
            protected  int beginIp65504P2873L;
            protected  int beginIp65504P2874S;
            protected  int beginIp65504P2874L;
            protected  int beginIp65504P2875S;
            protected  int beginIp65504P2875L;
            protected  int beginIp65504P2876S;
            protected  int beginIp65504P2876L;
            protected  int beginIp65504P2877S;
            protected  int beginIp65504P2877L;
            protected  int beginIp65504P2878S;
            protected  int beginIp65504P2878L;
            protected  int beginIp65504P2879S;
            protected  int beginIp65504P2879L;
            protected  int beginIp65504P2880S;
            protected  int beginIp65504P2880L;
            protected  int beginIp65504P2881S;
            protected  int beginIp65504P2881L;
            protected  int beginIp65504P2882S;
            protected  int beginIp65504P2882L;
            protected  int beginIp65504P2883S;
            protected  int beginIp65504P2883L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup93Serialized
	**/
    public Ip65504PdsNamesLargeGroup93Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup93Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup93Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup93Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,22812); // serialize this field at offset 22812 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup93Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 22812 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup93Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_93_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2853S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2853L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2854S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2854L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2855S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2855L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2856S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2856L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2857S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2857L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2858S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2858L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2859S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2859L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2860S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2860L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2861S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2861L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2862S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2862L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2863S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2863L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2864S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2864L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2865S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2865L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2866S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2866L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2867S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2867L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2868S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2868L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2869S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2869L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2870S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2870L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2871S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2871L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2872S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2872L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2873S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2873L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2874S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2874L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2875S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2875L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2876S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2876L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2877S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2877L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2878S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2878L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2879S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2879L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2880S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2880L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2881S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2881L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2882S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2882L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2883S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2883L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2853SCounter = -1;
         public boolean isIp65504P2853SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2853SCounter != sharedCounter;
            localIp65504P2853SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2853_S_LEN = 2;
  	/**
	 * serializeIp65504P2853S
	 */
	protected void serializeIp65504P2853S(short ip65504P2853S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2853S,IP_65504_P_2853_S_LEN)
                  ,beginIp65504P2853S
                  ,IP_65504_P_2853_S_LEN
                 );
            localIp65504P2853SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2853SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2853S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2853S() {	 
			return (getShort(beginIp65504P2853S));
   	}
         int localIp65504P2853LCounter = -1;
         public boolean isIp65504P2853LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2853LCounter != sharedCounter;
            localIp65504P2853LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2853_L_LEN = 2;
  	/**
	 * serializeIp65504P2853L
	 */
	protected void serializeIp65504P2853L(short ip65504P2853L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2853L,IP_65504_P_2853_L_LEN)
                  ,beginIp65504P2853L
                  ,IP_65504_P_2853_L_LEN
                 );
            localIp65504P2853LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2853LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2853L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2853L() {	 
			return (getShort(beginIp65504P2853L));
   	}
         int localIp65504P2854SCounter = -1;
         public boolean isIp65504P2854SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2854SCounter != sharedCounter;
            localIp65504P2854SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2854_S_LEN = 2;
  	/**
	 * serializeIp65504P2854S
	 */
	protected void serializeIp65504P2854S(short ip65504P2854S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2854S,IP_65504_P_2854_S_LEN)
                  ,beginIp65504P2854S
                  ,IP_65504_P_2854_S_LEN
                 );
            localIp65504P2854SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2854SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2854S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2854S() {	 
			return (getShort(beginIp65504P2854S));
   	}
         int localIp65504P2854LCounter = -1;
         public boolean isIp65504P2854LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2854LCounter != sharedCounter;
            localIp65504P2854LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2854_L_LEN = 2;
  	/**
	 * serializeIp65504P2854L
	 */
	protected void serializeIp65504P2854L(short ip65504P2854L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2854L,IP_65504_P_2854_L_LEN)
                  ,beginIp65504P2854L
                  ,IP_65504_P_2854_L_LEN
                 );
            localIp65504P2854LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2854LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2854L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2854L() {	 
			return (getShort(beginIp65504P2854L));
   	}
         int localIp65504P2855SCounter = -1;
         public boolean isIp65504P2855SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2855SCounter != sharedCounter;
            localIp65504P2855SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2855_S_LEN = 2;
  	/**
	 * serializeIp65504P2855S
	 */
	protected void serializeIp65504P2855S(short ip65504P2855S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2855S,IP_65504_P_2855_S_LEN)
                  ,beginIp65504P2855S
                  ,IP_65504_P_2855_S_LEN
                 );
            localIp65504P2855SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2855SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2855S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2855S() {	 
			return (getShort(beginIp65504P2855S));
   	}
         int localIp65504P2855LCounter = -1;
         public boolean isIp65504P2855LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2855LCounter != sharedCounter;
            localIp65504P2855LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2855_L_LEN = 2;
  	/**
	 * serializeIp65504P2855L
	 */
	protected void serializeIp65504P2855L(short ip65504P2855L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2855L,IP_65504_P_2855_L_LEN)
                  ,beginIp65504P2855L
                  ,IP_65504_P_2855_L_LEN
                 );
            localIp65504P2855LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2855LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2855L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2855L() {	 
			return (getShort(beginIp65504P2855L));
   	}
         int localIp65504P2856SCounter = -1;
         public boolean isIp65504P2856SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2856SCounter != sharedCounter;
            localIp65504P2856SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2856_S_LEN = 2;
  	/**
	 * serializeIp65504P2856S
	 */
	protected void serializeIp65504P2856S(short ip65504P2856S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2856S,IP_65504_P_2856_S_LEN)
                  ,beginIp65504P2856S
                  ,IP_65504_P_2856_S_LEN
                 );
            localIp65504P2856SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2856SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2856S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2856S() {	 
			return (getShort(beginIp65504P2856S));
   	}
         int localIp65504P2856LCounter = -1;
         public boolean isIp65504P2856LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2856LCounter != sharedCounter;
            localIp65504P2856LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2856_L_LEN = 2;
  	/**
	 * serializeIp65504P2856L
	 */
	protected void serializeIp65504P2856L(short ip65504P2856L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2856L,IP_65504_P_2856_L_LEN)
                  ,beginIp65504P2856L
                  ,IP_65504_P_2856_L_LEN
                 );
            localIp65504P2856LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2856LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2856L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2856L() {	 
			return (getShort(beginIp65504P2856L));
   	}
         int localIp65504P2857SCounter = -1;
         public boolean isIp65504P2857SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2857SCounter != sharedCounter;
            localIp65504P2857SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2857_S_LEN = 2;
  	/**
	 * serializeIp65504P2857S
	 */
	protected void serializeIp65504P2857S(short ip65504P2857S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2857S,IP_65504_P_2857_S_LEN)
                  ,beginIp65504P2857S
                  ,IP_65504_P_2857_S_LEN
                 );
            localIp65504P2857SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2857SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2857S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2857S() {	 
			return (getShort(beginIp65504P2857S));
   	}
         int localIp65504P2857LCounter = -1;
         public boolean isIp65504P2857LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2857LCounter != sharedCounter;
            localIp65504P2857LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2857_L_LEN = 2;
  	/**
	 * serializeIp65504P2857L
	 */
	protected void serializeIp65504P2857L(short ip65504P2857L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2857L,IP_65504_P_2857_L_LEN)
                  ,beginIp65504P2857L
                  ,IP_65504_P_2857_L_LEN
                 );
            localIp65504P2857LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2857LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2857L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2857L() {	 
			return (getShort(beginIp65504P2857L));
   	}
         int localIp65504P2858SCounter = -1;
         public boolean isIp65504P2858SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2858SCounter != sharedCounter;
            localIp65504P2858SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2858_S_LEN = 2;
  	/**
	 * serializeIp65504P2858S
	 */
	protected void serializeIp65504P2858S(short ip65504P2858S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2858S,IP_65504_P_2858_S_LEN)
                  ,beginIp65504P2858S
                  ,IP_65504_P_2858_S_LEN
                 );
            localIp65504P2858SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2858SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2858S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2858S() {	 
			return (getShort(beginIp65504P2858S));
   	}
         int localIp65504P2858LCounter = -1;
         public boolean isIp65504P2858LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2858LCounter != sharedCounter;
            localIp65504P2858LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2858_L_LEN = 2;
  	/**
	 * serializeIp65504P2858L
	 */
	protected void serializeIp65504P2858L(short ip65504P2858L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2858L,IP_65504_P_2858_L_LEN)
                  ,beginIp65504P2858L
                  ,IP_65504_P_2858_L_LEN
                 );
            localIp65504P2858LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2858LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2858L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2858L() {	 
			return (getShort(beginIp65504P2858L));
   	}
         int localIp65504P2859SCounter = -1;
         public boolean isIp65504P2859SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2859SCounter != sharedCounter;
            localIp65504P2859SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2859_S_LEN = 2;
  	/**
	 * serializeIp65504P2859S
	 */
	protected void serializeIp65504P2859S(short ip65504P2859S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2859S,IP_65504_P_2859_S_LEN)
                  ,beginIp65504P2859S
                  ,IP_65504_P_2859_S_LEN
                 );
            localIp65504P2859SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2859SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2859S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2859S() {	 
			return (getShort(beginIp65504P2859S));
   	}
         int localIp65504P2859LCounter = -1;
         public boolean isIp65504P2859LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2859LCounter != sharedCounter;
            localIp65504P2859LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2859_L_LEN = 2;
  	/**
	 * serializeIp65504P2859L
	 */
	protected void serializeIp65504P2859L(short ip65504P2859L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2859L,IP_65504_P_2859_L_LEN)
                  ,beginIp65504P2859L
                  ,IP_65504_P_2859_L_LEN
                 );
            localIp65504P2859LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2859LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2859L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2859L() {	 
			return (getShort(beginIp65504P2859L));
   	}
         int localIp65504P2860SCounter = -1;
         public boolean isIp65504P2860SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2860SCounter != sharedCounter;
            localIp65504P2860SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2860_S_LEN = 2;
  	/**
	 * serializeIp65504P2860S
	 */
	protected void serializeIp65504P2860S(short ip65504P2860S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2860S,IP_65504_P_2860_S_LEN)
                  ,beginIp65504P2860S
                  ,IP_65504_P_2860_S_LEN
                 );
            localIp65504P2860SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2860SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2860S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2860S() {	 
			return (getShort(beginIp65504P2860S));
   	}
         int localIp65504P2860LCounter = -1;
         public boolean isIp65504P2860LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2860LCounter != sharedCounter;
            localIp65504P2860LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2860_L_LEN = 2;
  	/**
	 * serializeIp65504P2860L
	 */
	protected void serializeIp65504P2860L(short ip65504P2860L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2860L,IP_65504_P_2860_L_LEN)
                  ,beginIp65504P2860L
                  ,IP_65504_P_2860_L_LEN
                 );
            localIp65504P2860LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2860LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2860L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2860L() {	 
			return (getShort(beginIp65504P2860L));
   	}
         int localIp65504P2861SCounter = -1;
         public boolean isIp65504P2861SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2861SCounter != sharedCounter;
            localIp65504P2861SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2861_S_LEN = 2;
  	/**
	 * serializeIp65504P2861S
	 */
	protected void serializeIp65504P2861S(short ip65504P2861S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2861S,IP_65504_P_2861_S_LEN)
                  ,beginIp65504P2861S
                  ,IP_65504_P_2861_S_LEN
                 );
            localIp65504P2861SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2861SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2861S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2861S() {	 
			return (getShort(beginIp65504P2861S));
   	}
         int localIp65504P2861LCounter = -1;
         public boolean isIp65504P2861LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2861LCounter != sharedCounter;
            localIp65504P2861LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2861_L_LEN = 2;
  	/**
	 * serializeIp65504P2861L
	 */
	protected void serializeIp65504P2861L(short ip65504P2861L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2861L,IP_65504_P_2861_L_LEN)
                  ,beginIp65504P2861L
                  ,IP_65504_P_2861_L_LEN
                 );
            localIp65504P2861LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2861LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2861L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2861L() {	 
			return (getShort(beginIp65504P2861L));
   	}
         int localIp65504P2862SCounter = -1;
         public boolean isIp65504P2862SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2862SCounter != sharedCounter;
            localIp65504P2862SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2862_S_LEN = 2;
  	/**
	 * serializeIp65504P2862S
	 */
	protected void serializeIp65504P2862S(short ip65504P2862S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2862S,IP_65504_P_2862_S_LEN)
                  ,beginIp65504P2862S
                  ,IP_65504_P_2862_S_LEN
                 );
            localIp65504P2862SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2862SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2862S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2862S() {	 
			return (getShort(beginIp65504P2862S));
   	}
         int localIp65504P2862LCounter = -1;
         public boolean isIp65504P2862LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2862LCounter != sharedCounter;
            localIp65504P2862LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2862_L_LEN = 2;
  	/**
	 * serializeIp65504P2862L
	 */
	protected void serializeIp65504P2862L(short ip65504P2862L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2862L,IP_65504_P_2862_L_LEN)
                  ,beginIp65504P2862L
                  ,IP_65504_P_2862_L_LEN
                 );
            localIp65504P2862LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2862LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2862L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2862L() {	 
			return (getShort(beginIp65504P2862L));
   	}
         int localIp65504P2863SCounter = -1;
         public boolean isIp65504P2863SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2863SCounter != sharedCounter;
            localIp65504P2863SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2863_S_LEN = 2;
  	/**
	 * serializeIp65504P2863S
	 */
	protected void serializeIp65504P2863S(short ip65504P2863S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2863S,IP_65504_P_2863_S_LEN)
                  ,beginIp65504P2863S
                  ,IP_65504_P_2863_S_LEN
                 );
            localIp65504P2863SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2863SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2863S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2863S() {	 
			return (getShort(beginIp65504P2863S));
   	}
         int localIp65504P2863LCounter = -1;
         public boolean isIp65504P2863LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2863LCounter != sharedCounter;
            localIp65504P2863LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2863_L_LEN = 2;
  	/**
	 * serializeIp65504P2863L
	 */
	protected void serializeIp65504P2863L(short ip65504P2863L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2863L,IP_65504_P_2863_L_LEN)
                  ,beginIp65504P2863L
                  ,IP_65504_P_2863_L_LEN
                 );
            localIp65504P2863LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2863LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2863L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2863L() {	 
			return (getShort(beginIp65504P2863L));
   	}
         int localIp65504P2864SCounter = -1;
         public boolean isIp65504P2864SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2864SCounter != sharedCounter;
            localIp65504P2864SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2864_S_LEN = 2;
  	/**
	 * serializeIp65504P2864S
	 */
	protected void serializeIp65504P2864S(short ip65504P2864S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2864S,IP_65504_P_2864_S_LEN)
                  ,beginIp65504P2864S
                  ,IP_65504_P_2864_S_LEN
                 );
            localIp65504P2864SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2864SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2864S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2864S() {	 
			return (getShort(beginIp65504P2864S));
   	}
         int localIp65504P2864LCounter = -1;
         public boolean isIp65504P2864LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2864LCounter != sharedCounter;
            localIp65504P2864LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2864_L_LEN = 2;
  	/**
	 * serializeIp65504P2864L
	 */
	protected void serializeIp65504P2864L(short ip65504P2864L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2864L,IP_65504_P_2864_L_LEN)
                  ,beginIp65504P2864L
                  ,IP_65504_P_2864_L_LEN
                 );
            localIp65504P2864LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2864LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2864L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2864L() {	 
			return (getShort(beginIp65504P2864L));
   	}
         int localIp65504P2865SCounter = -1;
         public boolean isIp65504P2865SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2865SCounter != sharedCounter;
            localIp65504P2865SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2865_S_LEN = 2;
  	/**
	 * serializeIp65504P2865S
	 */
	protected void serializeIp65504P2865S(short ip65504P2865S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2865S,IP_65504_P_2865_S_LEN)
                  ,beginIp65504P2865S
                  ,IP_65504_P_2865_S_LEN
                 );
            localIp65504P2865SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2865SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2865S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2865S() {	 
			return (getShort(beginIp65504P2865S));
   	}
         int localIp65504P2865LCounter = -1;
         public boolean isIp65504P2865LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2865LCounter != sharedCounter;
            localIp65504P2865LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2865_L_LEN = 2;
  	/**
	 * serializeIp65504P2865L
	 */
	protected void serializeIp65504P2865L(short ip65504P2865L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2865L,IP_65504_P_2865_L_LEN)
                  ,beginIp65504P2865L
                  ,IP_65504_P_2865_L_LEN
                 );
            localIp65504P2865LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2865LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2865L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2865L() {	 
			return (getShort(beginIp65504P2865L));
   	}
         int localIp65504P2866SCounter = -1;
         public boolean isIp65504P2866SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2866SCounter != sharedCounter;
            localIp65504P2866SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2866_S_LEN = 2;
  	/**
	 * serializeIp65504P2866S
	 */
	protected void serializeIp65504P2866S(short ip65504P2866S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2866S,IP_65504_P_2866_S_LEN)
                  ,beginIp65504P2866S
                  ,IP_65504_P_2866_S_LEN
                 );
            localIp65504P2866SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2866SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2866S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2866S() {	 
			return (getShort(beginIp65504P2866S));
   	}
         int localIp65504P2866LCounter = -1;
         public boolean isIp65504P2866LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2866LCounter != sharedCounter;
            localIp65504P2866LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2866_L_LEN = 2;
  	/**
	 * serializeIp65504P2866L
	 */
	protected void serializeIp65504P2866L(short ip65504P2866L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2866L,IP_65504_P_2866_L_LEN)
                  ,beginIp65504P2866L
                  ,IP_65504_P_2866_L_LEN
                 );
            localIp65504P2866LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2866LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2866L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2866L() {	 
			return (getShort(beginIp65504P2866L));
   	}
         int localIp65504P2867SCounter = -1;
         public boolean isIp65504P2867SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2867SCounter != sharedCounter;
            localIp65504P2867SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2867_S_LEN = 2;
  	/**
	 * serializeIp65504P2867S
	 */
	protected void serializeIp65504P2867S(short ip65504P2867S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2867S,IP_65504_P_2867_S_LEN)
                  ,beginIp65504P2867S
                  ,IP_65504_P_2867_S_LEN
                 );
            localIp65504P2867SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2867SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2867S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2867S() {	 
			return (getShort(beginIp65504P2867S));
   	}
         int localIp65504P2867LCounter = -1;
         public boolean isIp65504P2867LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2867LCounter != sharedCounter;
            localIp65504P2867LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2867_L_LEN = 2;
  	/**
	 * serializeIp65504P2867L
	 */
	protected void serializeIp65504P2867L(short ip65504P2867L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2867L,IP_65504_P_2867_L_LEN)
                  ,beginIp65504P2867L
                  ,IP_65504_P_2867_L_LEN
                 );
            localIp65504P2867LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2867LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2867L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2867L() {	 
			return (getShort(beginIp65504P2867L));
   	}
         int localIp65504P2868SCounter = -1;
         public boolean isIp65504P2868SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2868SCounter != sharedCounter;
            localIp65504P2868SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2868_S_LEN = 2;
  	/**
	 * serializeIp65504P2868S
	 */
	protected void serializeIp65504P2868S(short ip65504P2868S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2868S,IP_65504_P_2868_S_LEN)
                  ,beginIp65504P2868S
                  ,IP_65504_P_2868_S_LEN
                 );
            localIp65504P2868SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2868SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2868S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2868S() {	 
			return (getShort(beginIp65504P2868S));
   	}
         int localIp65504P2868LCounter = -1;
         public boolean isIp65504P2868LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2868LCounter != sharedCounter;
            localIp65504P2868LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2868_L_LEN = 2;
  	/**
	 * serializeIp65504P2868L
	 */
	protected void serializeIp65504P2868L(short ip65504P2868L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2868L,IP_65504_P_2868_L_LEN)
                  ,beginIp65504P2868L
                  ,IP_65504_P_2868_L_LEN
                 );
            localIp65504P2868LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2868LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2868L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2868L() {	 
			return (getShort(beginIp65504P2868L));
   	}
         int localIp65504P2869SCounter = -1;
         public boolean isIp65504P2869SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2869SCounter != sharedCounter;
            localIp65504P2869SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2869_S_LEN = 2;
  	/**
	 * serializeIp65504P2869S
	 */
	protected void serializeIp65504P2869S(short ip65504P2869S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2869S,IP_65504_P_2869_S_LEN)
                  ,beginIp65504P2869S
                  ,IP_65504_P_2869_S_LEN
                 );
            localIp65504P2869SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2869SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2869S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2869S() {	 
			return (getShort(beginIp65504P2869S));
   	}
         int localIp65504P2869LCounter = -1;
         public boolean isIp65504P2869LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2869LCounter != sharedCounter;
            localIp65504P2869LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2869_L_LEN = 2;
  	/**
	 * serializeIp65504P2869L
	 */
	protected void serializeIp65504P2869L(short ip65504P2869L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2869L,IP_65504_P_2869_L_LEN)
                  ,beginIp65504P2869L
                  ,IP_65504_P_2869_L_LEN
                 );
            localIp65504P2869LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2869LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2869L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2869L() {	 
			return (getShort(beginIp65504P2869L));
   	}
         int localIp65504P2870SCounter = -1;
         public boolean isIp65504P2870SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2870SCounter != sharedCounter;
            localIp65504P2870SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2870_S_LEN = 2;
  	/**
	 * serializeIp65504P2870S
	 */
	protected void serializeIp65504P2870S(short ip65504P2870S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2870S,IP_65504_P_2870_S_LEN)
                  ,beginIp65504P2870S
                  ,IP_65504_P_2870_S_LEN
                 );
            localIp65504P2870SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2870SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2870S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2870S() {	 
			return (getShort(beginIp65504P2870S));
   	}
         int localIp65504P2870LCounter = -1;
         public boolean isIp65504P2870LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2870LCounter != sharedCounter;
            localIp65504P2870LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2870_L_LEN = 2;
  	/**
	 * serializeIp65504P2870L
	 */
	protected void serializeIp65504P2870L(short ip65504P2870L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2870L,IP_65504_P_2870_L_LEN)
                  ,beginIp65504P2870L
                  ,IP_65504_P_2870_L_LEN
                 );
            localIp65504P2870LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2870LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2870L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2870L() {	 
			return (getShort(beginIp65504P2870L));
   	}
         int localIp65504P2871SCounter = -1;
         public boolean isIp65504P2871SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2871SCounter != sharedCounter;
            localIp65504P2871SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2871_S_LEN = 2;
  	/**
	 * serializeIp65504P2871S
	 */
	protected void serializeIp65504P2871S(short ip65504P2871S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2871S,IP_65504_P_2871_S_LEN)
                  ,beginIp65504P2871S
                  ,IP_65504_P_2871_S_LEN
                 );
            localIp65504P2871SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2871SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2871S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2871S() {	 
			return (getShort(beginIp65504P2871S));
   	}
         int localIp65504P2871LCounter = -1;
         public boolean isIp65504P2871LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2871LCounter != sharedCounter;
            localIp65504P2871LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2871_L_LEN = 2;
  	/**
	 * serializeIp65504P2871L
	 */
	protected void serializeIp65504P2871L(short ip65504P2871L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2871L,IP_65504_P_2871_L_LEN)
                  ,beginIp65504P2871L
                  ,IP_65504_P_2871_L_LEN
                 );
            localIp65504P2871LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2871LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2871L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2871L() {	 
			return (getShort(beginIp65504P2871L));
   	}
         int localIp65504P2872SCounter = -1;
         public boolean isIp65504P2872SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2872SCounter != sharedCounter;
            localIp65504P2872SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2872_S_LEN = 2;
  	/**
	 * serializeIp65504P2872S
	 */
	protected void serializeIp65504P2872S(short ip65504P2872S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2872S,IP_65504_P_2872_S_LEN)
                  ,beginIp65504P2872S
                  ,IP_65504_P_2872_S_LEN
                 );
            localIp65504P2872SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2872SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2872S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2872S() {	 
			return (getShort(beginIp65504P2872S));
   	}
         int localIp65504P2872LCounter = -1;
         public boolean isIp65504P2872LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2872LCounter != sharedCounter;
            localIp65504P2872LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2872_L_LEN = 2;
  	/**
	 * serializeIp65504P2872L
	 */
	protected void serializeIp65504P2872L(short ip65504P2872L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2872L,IP_65504_P_2872_L_LEN)
                  ,beginIp65504P2872L
                  ,IP_65504_P_2872_L_LEN
                 );
            localIp65504P2872LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2872LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2872L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2872L() {	 
			return (getShort(beginIp65504P2872L));
   	}
         int localIp65504P2873SCounter = -1;
         public boolean isIp65504P2873SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2873SCounter != sharedCounter;
            localIp65504P2873SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2873_S_LEN = 2;
  	/**
	 * serializeIp65504P2873S
	 */
	protected void serializeIp65504P2873S(short ip65504P2873S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2873S,IP_65504_P_2873_S_LEN)
                  ,beginIp65504P2873S
                  ,IP_65504_P_2873_S_LEN
                 );
            localIp65504P2873SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2873SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2873S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2873S() {	 
			return (getShort(beginIp65504P2873S));
   	}
         int localIp65504P2873LCounter = -1;
         public boolean isIp65504P2873LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2873LCounter != sharedCounter;
            localIp65504P2873LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2873_L_LEN = 2;
  	/**
	 * serializeIp65504P2873L
	 */
	protected void serializeIp65504P2873L(short ip65504P2873L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2873L,IP_65504_P_2873_L_LEN)
                  ,beginIp65504P2873L
                  ,IP_65504_P_2873_L_LEN
                 );
            localIp65504P2873LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2873LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2873L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2873L() {	 
			return (getShort(beginIp65504P2873L));
   	}
         int localIp65504P2874SCounter = -1;
         public boolean isIp65504P2874SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2874SCounter != sharedCounter;
            localIp65504P2874SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2874_S_LEN = 2;
  	/**
	 * serializeIp65504P2874S
	 */
	protected void serializeIp65504P2874S(short ip65504P2874S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2874S,IP_65504_P_2874_S_LEN)
                  ,beginIp65504P2874S
                  ,IP_65504_P_2874_S_LEN
                 );
            localIp65504P2874SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2874SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2874S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2874S() {	 
			return (getShort(beginIp65504P2874S));
   	}
         int localIp65504P2874LCounter = -1;
         public boolean isIp65504P2874LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2874LCounter != sharedCounter;
            localIp65504P2874LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2874_L_LEN = 2;
  	/**
	 * serializeIp65504P2874L
	 */
	protected void serializeIp65504P2874L(short ip65504P2874L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2874L,IP_65504_P_2874_L_LEN)
                  ,beginIp65504P2874L
                  ,IP_65504_P_2874_L_LEN
                 );
            localIp65504P2874LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2874LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2874L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2874L() {	 
			return (getShort(beginIp65504P2874L));
   	}
         int localIp65504P2875SCounter = -1;
         public boolean isIp65504P2875SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2875SCounter != sharedCounter;
            localIp65504P2875SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2875_S_LEN = 2;
  	/**
	 * serializeIp65504P2875S
	 */
	protected void serializeIp65504P2875S(short ip65504P2875S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2875S,IP_65504_P_2875_S_LEN)
                  ,beginIp65504P2875S
                  ,IP_65504_P_2875_S_LEN
                 );
            localIp65504P2875SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2875SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2875S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2875S() {	 
			return (getShort(beginIp65504P2875S));
   	}
         int localIp65504P2875LCounter = -1;
         public boolean isIp65504P2875LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2875LCounter != sharedCounter;
            localIp65504P2875LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2875_L_LEN = 2;
  	/**
	 * serializeIp65504P2875L
	 */
	protected void serializeIp65504P2875L(short ip65504P2875L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2875L,IP_65504_P_2875_L_LEN)
                  ,beginIp65504P2875L
                  ,IP_65504_P_2875_L_LEN
                 );
            localIp65504P2875LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2875LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2875L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2875L() {	 
			return (getShort(beginIp65504P2875L));
   	}
         int localIp65504P2876SCounter = -1;
         public boolean isIp65504P2876SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2876SCounter != sharedCounter;
            localIp65504P2876SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2876_S_LEN = 2;
  	/**
	 * serializeIp65504P2876S
	 */
	protected void serializeIp65504P2876S(short ip65504P2876S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2876S,IP_65504_P_2876_S_LEN)
                  ,beginIp65504P2876S
                  ,IP_65504_P_2876_S_LEN
                 );
            localIp65504P2876SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2876SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2876S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2876S() {	 
			return (getShort(beginIp65504P2876S));
   	}
         int localIp65504P2876LCounter = -1;
         public boolean isIp65504P2876LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2876LCounter != sharedCounter;
            localIp65504P2876LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2876_L_LEN = 2;
  	/**
	 * serializeIp65504P2876L
	 */
	protected void serializeIp65504P2876L(short ip65504P2876L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2876L,IP_65504_P_2876_L_LEN)
                  ,beginIp65504P2876L
                  ,IP_65504_P_2876_L_LEN
                 );
            localIp65504P2876LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2876LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2876L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2876L() {	 
			return (getShort(beginIp65504P2876L));
   	}
         int localIp65504P2877SCounter = -1;
         public boolean isIp65504P2877SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2877SCounter != sharedCounter;
            localIp65504P2877SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2877_S_LEN = 2;
  	/**
	 * serializeIp65504P2877S
	 */
	protected void serializeIp65504P2877S(short ip65504P2877S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2877S,IP_65504_P_2877_S_LEN)
                  ,beginIp65504P2877S
                  ,IP_65504_P_2877_S_LEN
                 );
            localIp65504P2877SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2877SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2877S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2877S() {	 
			return (getShort(beginIp65504P2877S));
   	}
         int localIp65504P2877LCounter = -1;
         public boolean isIp65504P2877LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2877LCounter != sharedCounter;
            localIp65504P2877LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2877_L_LEN = 2;
  	/**
	 * serializeIp65504P2877L
	 */
	protected void serializeIp65504P2877L(short ip65504P2877L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2877L,IP_65504_P_2877_L_LEN)
                  ,beginIp65504P2877L
                  ,IP_65504_P_2877_L_LEN
                 );
            localIp65504P2877LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2877LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2877L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2877L() {	 
			return (getShort(beginIp65504P2877L));
   	}
         int localIp65504P2878SCounter = -1;
         public boolean isIp65504P2878SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2878SCounter != sharedCounter;
            localIp65504P2878SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2878_S_LEN = 2;
  	/**
	 * serializeIp65504P2878S
	 */
	protected void serializeIp65504P2878S(short ip65504P2878S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2878S,IP_65504_P_2878_S_LEN)
                  ,beginIp65504P2878S
                  ,IP_65504_P_2878_S_LEN
                 );
            localIp65504P2878SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2878SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2878S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2878S() {	 
			return (getShort(beginIp65504P2878S));
   	}
         int localIp65504P2878LCounter = -1;
         public boolean isIp65504P2878LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2878LCounter != sharedCounter;
            localIp65504P2878LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2878_L_LEN = 2;
  	/**
	 * serializeIp65504P2878L
	 */
	protected void serializeIp65504P2878L(short ip65504P2878L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2878L,IP_65504_P_2878_L_LEN)
                  ,beginIp65504P2878L
                  ,IP_65504_P_2878_L_LEN
                 );
            localIp65504P2878LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2878LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2878L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2878L() {	 
			return (getShort(beginIp65504P2878L));
   	}
         int localIp65504P2879SCounter = -1;
         public boolean isIp65504P2879SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2879SCounter != sharedCounter;
            localIp65504P2879SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2879_S_LEN = 2;
  	/**
	 * serializeIp65504P2879S
	 */
	protected void serializeIp65504P2879S(short ip65504P2879S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2879S,IP_65504_P_2879_S_LEN)
                  ,beginIp65504P2879S
                  ,IP_65504_P_2879_S_LEN
                 );
            localIp65504P2879SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2879SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2879S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2879S() {	 
			return (getShort(beginIp65504P2879S));
   	}
         int localIp65504P2879LCounter = -1;
         public boolean isIp65504P2879LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2879LCounter != sharedCounter;
            localIp65504P2879LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2879_L_LEN = 2;
  	/**
	 * serializeIp65504P2879L
	 */
	protected void serializeIp65504P2879L(short ip65504P2879L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2879L,IP_65504_P_2879_L_LEN)
                  ,beginIp65504P2879L
                  ,IP_65504_P_2879_L_LEN
                 );
            localIp65504P2879LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2879LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2879L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2879L() {	 
			return (getShort(beginIp65504P2879L));
   	}
         int localIp65504P2880SCounter = -1;
         public boolean isIp65504P2880SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2880SCounter != sharedCounter;
            localIp65504P2880SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2880_S_LEN = 2;
  	/**
	 * serializeIp65504P2880S
	 */
	protected void serializeIp65504P2880S(short ip65504P2880S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2880S,IP_65504_P_2880_S_LEN)
                  ,beginIp65504P2880S
                  ,IP_65504_P_2880_S_LEN
                 );
            localIp65504P2880SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2880SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2880S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2880S() {	 
			return (getShort(beginIp65504P2880S));
   	}
         int localIp65504P2880LCounter = -1;
         public boolean isIp65504P2880LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2880LCounter != sharedCounter;
            localIp65504P2880LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2880_L_LEN = 2;
  	/**
	 * serializeIp65504P2880L
	 */
	protected void serializeIp65504P2880L(short ip65504P2880L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2880L,IP_65504_P_2880_L_LEN)
                  ,beginIp65504P2880L
                  ,IP_65504_P_2880_L_LEN
                 );
            localIp65504P2880LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2880LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2880L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2880L() {	 
			return (getShort(beginIp65504P2880L));
   	}
         int localIp65504P2881SCounter = -1;
         public boolean isIp65504P2881SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2881SCounter != sharedCounter;
            localIp65504P2881SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2881_S_LEN = 2;
  	/**
	 * serializeIp65504P2881S
	 */
	protected void serializeIp65504P2881S(short ip65504P2881S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2881S,IP_65504_P_2881_S_LEN)
                  ,beginIp65504P2881S
                  ,IP_65504_P_2881_S_LEN
                 );
            localIp65504P2881SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2881SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2881S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2881S() {	 
			return (getShort(beginIp65504P2881S));
   	}
         int localIp65504P2881LCounter = -1;
         public boolean isIp65504P2881LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2881LCounter != sharedCounter;
            localIp65504P2881LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2881_L_LEN = 2;
  	/**
	 * serializeIp65504P2881L
	 */
	protected void serializeIp65504P2881L(short ip65504P2881L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2881L,IP_65504_P_2881_L_LEN)
                  ,beginIp65504P2881L
                  ,IP_65504_P_2881_L_LEN
                 );
            localIp65504P2881LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2881LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2881L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2881L() {	 
			return (getShort(beginIp65504P2881L));
   	}
         int localIp65504P2882SCounter = -1;
         public boolean isIp65504P2882SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2882SCounter != sharedCounter;
            localIp65504P2882SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2882_S_LEN = 2;
  	/**
	 * serializeIp65504P2882S
	 */
	protected void serializeIp65504P2882S(short ip65504P2882S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2882S,IP_65504_P_2882_S_LEN)
                  ,beginIp65504P2882S
                  ,IP_65504_P_2882_S_LEN
                 );
            localIp65504P2882SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2882SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2882S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2882S() {	 
			return (getShort(beginIp65504P2882S));
   	}
         int localIp65504P2882LCounter = -1;
         public boolean isIp65504P2882LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2882LCounter != sharedCounter;
            localIp65504P2882LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2882_L_LEN = 2;
  	/**
	 * serializeIp65504P2882L
	 */
	protected void serializeIp65504P2882L(short ip65504P2882L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2882L,IP_65504_P_2882_L_LEN)
                  ,beginIp65504P2882L
                  ,IP_65504_P_2882_L_LEN
                 );
            localIp65504P2882LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2882LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2882L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2882L() {	 
			return (getShort(beginIp65504P2882L));
   	}
         int localIp65504P2883SCounter = -1;
         public boolean isIp65504P2883SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2883SCounter != sharedCounter;
            localIp65504P2883SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2883_S_LEN = 2;
  	/**
	 * serializeIp65504P2883S
	 */
	protected void serializeIp65504P2883S(short ip65504P2883S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2883S,IP_65504_P_2883_S_LEN)
                  ,beginIp65504P2883S
                  ,IP_65504_P_2883_S_LEN
                 );
            localIp65504P2883SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2883SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2883S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2883S() {	 
			return (getShort(beginIp65504P2883S));
   	}
         int localIp65504P2883LCounter = -1;
         public boolean isIp65504P2883LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2883LCounter != sharedCounter;
            localIp65504P2883LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2883_L_LEN = 2;
  	/**
	 * serializeIp65504P2883L
	 */
	protected void serializeIp65504P2883L(short ip65504P2883L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2883L,IP_65504_P_2883_L_LEN)
                  ,beginIp65504P2883L
                  ,IP_65504_P_2883_L_LEN
                 );
            localIp65504P2883LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2883LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2883L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2883L() {	 
			return (getShort(beginIp65504P2883L));
   	}




}
  
