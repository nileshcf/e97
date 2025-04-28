package com.cloudframe.app.repository;

import com.cloudframe.app.d5427dt1.dto.*;
import com.cloudframe.app.data.Field;


public interface D5427dt1Repository {
    /**
     * This method will handle the sql operations for a update query.
     *
     * @parm sqlca
* @parm dcladjdClmsfRef
     */
    public void selectAdjdClmsfRef(Sqlca sqlca, DcladjdClmsfRef dcladjdClmsfRef) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcladjdClmhstDenormRef
* @parm sqlca
* @parm hostVariables
     */
    public void openCsrInitFil2D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm work
* @parm hvaClmHistArray
* @parm sqlca
     */
    public void fetchCsrInitFil2D5427dt1(Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrInitFil2D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcladjdClmhstDenormRef
* @parm sqlca
* @parm hostVariables
     */
    public void openCsrNextFil2D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm work
* @parm hvaClmHistArray
* @parm sqlca
     */
    public void fetchCsrNextFil2D5427dt1(Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrNextFil2D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm queryTextArea
* @parm sqlca
     */
    public void prepare(QueryTextArea queryTextArea, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcladjdClmhstDenormRef
* @parm sqlca
     */
    public void openCsrInitFullD5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm work
* @parm hvaClmHistArray
* @parm sqlca
     */
    public void fetchCsrInitFullD5427dt1(Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrInitFullD5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcladjdClmhstDenormRef
* @parm sqlca
* @parm hostVariables
     */
    public void openCsrInitFiltD5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm work
* @parm hvaClmHistArray
* @parm sqlca
     */
    public void fetchCsrInitFiltD5427dt1(Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrInitFiltD5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcladjdClmhstDenormRef
* @parm sqlca
     */
    public void openCsrNextFullD5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm work
* @parm hvaClmHistArray
* @parm sqlca
     */
    public void fetchCsrNextFullD5427dt1(Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrNextFullD5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcladjdClmhstDenormRef
* @parm sqlca
* @parm hostVariables
     */
    public void openCsrNextFiltD5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm work
* @parm hvaClmHistArray
* @parm sqlca
     */
    public void fetchCsrNextFiltD5427dt1(Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrNextFiltD5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcladjdClmhstDenormRef
* @parm sqlca
* @parm hostVariables
     */
    public void openCsrInitFil3D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm work
* @parm hvaClmHistArray
* @parm sqlca
     */
    public void fetchCsrInitFil3D5427dt1(Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrInitFil3D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcladjdClmhstDenormRef
* @parm sqlca
* @parm hostVariables
     */
    public void openCsrNextFil3D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm work
* @parm hvaClmHistArray
* @parm sqlca
     */
    public void fetchCsrNextFil3D5427dt1(Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrNextFil3D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcladjdClmhstDenormRef
* @parm sqlca
* @parm hostVariables
     */
    public void openCsrInitFil4D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm work
* @parm hvaClmHistArray
* @parm sqlca
     */
    public void fetchCsrInitFil4D5427dt1(Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrInitFil4D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcladjdClmhstDenormRef
* @parm sqlca
* @parm hostVariables
     */
    public void openCsrNextFil4D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm work
* @parm hvaClmHistArray
* @parm sqlca
     */
    public void fetchCsrNextFil4D5427dt1(Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrNextFil4D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcladjdClmhstDenormRef
* @parm sqlca
* @parm hostVariables
     */
    public void openCsrInitFil5D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm work
* @parm hvaClmHistArray
* @parm sqlca
     */
    public void fetchCsrInitFil5D5427dt1(Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrInitFil5D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcladjdClmhstDenormRef
* @parm sqlca
* @parm hostVariables
     */
    public void openCsrNextFil5D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm work
* @parm hvaClmHistArray
* @parm sqlca
     */
    public void fetchCsrNextFil5D5427dt1(Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrNextFil5D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcladjdClmhstDenormRef
* @parm sqlca
* @parm hostVariables
     */
    public void openCsrInitFil6D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm work
* @parm hvaClmHistArray
* @parm sqlca
     */
    public void fetchCsrInitFil6D5427dt1(Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrInitFil6D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm dcladjdClmhstDenormRef
* @parm sqlca
* @parm hostVariables
     */
    public void openCsrNextFil6D5427dt1(DcladjdClmhstDenormRef dcladjdClmhstDenormRef, Sqlca sqlca, HostVariables hostVariables) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm work
* @parm hvaClmHistArray
* @parm sqlca
     */
    public void fetchCsrNextFil6D5427dt1(Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeCsrNextFil6D5427dt1(Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a open query.
     *
     * @parm sqlca
     */
    public void openDt1DynCursorD5427dt1(Field sqlda, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a multi-fetch query.
     *
     * @parm work
* @parm hvaClmHistArray
* @parm sqlca
     */
    public void fetchDt1DynCursorD5427dt1(Work work, HvaClmHistArray hvaClmHistArray, Sqlca sqlca) throws Exception;

    /**
     * This method will handle the sql operations for a close query.
     *
     * @parm sqlca
     */
    public void closeDt1DynCursorD5427dt1(Sqlca sqlca) throws Exception;

}
