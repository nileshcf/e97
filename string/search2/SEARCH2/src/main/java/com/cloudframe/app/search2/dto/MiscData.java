package com.cloudframe.app.search2.dto;

/**
*  The class MiscData is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 05:41. using version 5.0.0.257
**/


import com.cloudframe.annotation.processor.Data;
import com.cloudframe.annotation.processor.Getter;
import com.cloudframe.annotation.processor.Setter;
import com.cloudframe.app.data.Field;
import java.util.*;


@Data
public class MiscData extends MiscDataSerialized {
   

								@Getter @Setter private short i;

						@Getter @Setter private char[] cmdCaHomeSidBidCode = Field.fillLowValue(5);

						@Getter @Setter private char[] tbls = new char[286];
			@Getter @Setter private List<TblsRedefined> tblsRedefined = new ArrayList<>();
    	
	
	/**
	* Constructor for MiscData
	**/
    public MiscData() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < TBLS_REDEFINED_SIZE;arrayIndex++) {
						getTblsRedefined().add(new TblsRedefined(this, beginTblsRedefined + 
						arrayIndex * TblsRedefined.getTblsRedefinedFieldLength()));
				}
	   	/*  end of offset */
								setTbls("00001AAAAAA00002BBBBBB00003CCCCCC00004DDDDDD00005EEEEEE00006FFFFFF00007GGGGGG00008HHHHHH00009IIIIII00010JJJJJJ00011KKKKKK00012LLLLLL00013MMMMMM00014NNNNNN00015OOOOOO00016PPPPPP00017QQQQQQ00018RRRRRR00019SSSSSS00020TTTTTT00021UUUUUU00022VVVVVV00023WWWWWW00024XXXXXX00025YYYYYY00026ZZZZZZ".toCharArray());
    }





}
  
