/*
 * Copyright (C) 2012 The Exodus Project
 *
 * * Licensed under the GNU GPLv2 license
 *
 * The text of the license can be found in the LICENSE file
 * or at https://www.gnu.org/licenses/gpl-2.0.txt
 */

package com.exodus.updater.misc;

public class Constants {
    // Download related
    public static final String UPDATES_FOLDER = "exodusupdater";
    public static final String DOWNLOAD_ID = "download_id";
    public static final String DOWNLOAD_MD5 = "download_md5";

    // Preferences
    public static final String ENABLE_PREF = "pref_enable_updates";
    public static final String BACKUP_PREF = "pref_backup_rom";
    public static final String UPDATE_CHECK_PREF = "pref_update_check_interval";
    public static final String UPDATE_TYPE_PREF = "exodus_pref_update_types";//"pref_update_types";
    public static final String LAST_UPDATE_CHECK_PREF = "pref_last_update_check";

    // Update Check items
    public static final String BOOT_CHECK_COMPLETED = "boot_check_completed";
    public static final int UPDATE_FREQ_AT_BOOT = -1;
    public static final int UPDATE_FREQ_NONE = -2;
    public static final int UPDATE_FREQ_TWICE_DAILY = 43200;
    public static final int UPDATE_FREQ_DAILY = 86400;
    public static final int UPDATE_FREQ_WEEKLY = 604800;
    public static final int UPDATE_FREQ_BI_WEEKLY = 1209600;
    public static final int UPDATE_FREQ_MONTHLY = 2419200;

    // Update types
    //public static final int UPDATE_TYPE_NEW_STABLE = 0;
    public static final int UPDATE_TYPE_NEW_NIGHTLY = 0;//1;
    //public static final int UPDATE_TYPE_ALL_STABLE = 2;
    public static final int UPDATE_TYPE_ALL_NIGHTLY = 1;//3;

    // if this package is present, gapps are present
    public static final String GMS_CORE_PKG = "com.google.android.gms";
}
