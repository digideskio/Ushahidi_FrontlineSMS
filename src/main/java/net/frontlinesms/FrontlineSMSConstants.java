/*
 * FrontlineSMS <http://www.frontlinesms.com>
 * Copyright 2007, 2008 kiwanja
 * 
 * This file is part of FrontlineSMS.
 * 
 * FrontlineSMS is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 * 
 * FrontlineSMS is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with FrontlineSMS. If not, see <http://www.gnu.org/licenses/>.
 */
package net.frontlinesms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import net.frontlinesms.data.domain.Contact;
import net.frontlinesms.ui.i18n.InternationalisationUtils;

// FIXME many of these constants are UI-specific
public final class FrontlineSMSConstants {
	/** String for displaying the version of the application.  This has 1 substitution variable. */
	public static final String I18N_APP_VERSION = "application.version";
	
	public static final String FRONTLINE_SUPPORT_EMAIL = "frontlinesupport@kiwanja.net";
	public static final String FRONTLINE_SUPPORT_EMAIL_SERVER = "mail.kiwanja.net";
	
	public static final String ZIPPED_LOGS_FILENAME = "logs.zip";
	
	public static final String USE_DATABASE = "db";
	
	public static final String UNKNOWN_NOTES = "sentence.contact.added.automatically";
	public static final String UNKNOWN_NAME = "common.unnamed.contact";

	public static final String DEFAULT_START_PAGE = "0";

	public static final String TEST_NUMBER_NAME = "Test Number";
	public static final String EMULATOR_MSISDN = "000";

	public static final long DEFAULT_END_DATE = 0L;

	public static final int MOBILE_ID_LIMIT = 256;
	
	public static final String DEFAULT_DATABASE_NAME = "frontline_database";
	
	public static final String PROPERTY_CURRENT_PAGE = "currentPage";
	public static final String PROPERTY_ENTRIES_PER_PAGE = "entriesPerPage";
	public static final String PROPERTY_ACTION = "action";
	public static final String PROPERTY_COUNT = "count";
	
	public static final String PROPERTIES_SMS_INTERNET_ICONS = "sms.internet.icons";
	
	public static final String USER_MARKER_TO_NAME = "$to";

	public static final int RESULTS_PER_PAGE_DEFAULT = 100;

	public static final String ACTION_FORWARD = "action.create.forward.msg";
	public static final String ACTION_ADD_KEYWORD = "action.add.keyword";
	public static final String ACTION_CREATE = "action.create";
	public static final String ACTION_ADD_TO_GROUP = "action.add.to.group";
	public static final String ACTION_SAVE = "action.save";
	public static final String ACTION_CANCEL = "action.cancel";
	
//> CONTACTS i18n Keys
	/** [i18n key] "All contacts" */
	public static final String CONTACTS_ALL = "contacts.all";
	/** [i18n key] "Unnamed contacts" */
	public static final String CONTACTS_UNNAMED = "contacts.unnamed";
	/** [i18n key] "Ungrouped contacts" */
	public static final String CONTACTS_UNGROUPED = "contacts.ungrouped";
	
// COMMON i18n Keys TODO these need commenting
	public static final String COMMON_ALL = "common.all";
	public static final String COMMON_ALL_MESSAGES = "common.all.messages";
	public static final String COMMON_CONTACTS = "common.contacts";
	public static final String COMMON_GROUP = "common.group";
	public static final String COMMON_SURVEY = "common.survey";
	public static final String COMMON_REPLY = "common.reply";
	public static final String COMMON_EXTERNAL_COMMAND = "common.external.command";
	public static final String COMMON_COMMAND = "common.command";
	public static final String COMMON_LEAVE = "common.leave";
	public static final String COMMON_JOIN = "common.join";
	public static final String COMMON_DELIVERED = "common.type.delivered";
	public static final String COMMON_RETRYING = "common.type.retrying";
	public static final String COMMON_FAILED = "common.type.failed";
	public static final String COMMON_SENT = "common.sent";
	public static final String COMMON_PENDING = "common.type.pending";
	public static final String COMMON_OUTBOX = "common.type.outbox";
	public static final String COMMON_RECEIVED = "common.received";
	public static final String COMMON_DORMANT = "common.dormant";
	public static final String COMMON_ACTIVE = "common.active";
	public static final String COMMON_LIVE = "common.live";
	public static final String COMMON_TO_GROUP = "common.to.group";
	public static final String COMMON_AUTO_FORWARD_FOR_KEYWORD = "common.auto.forward.for.keyword";
	public static final String COMMON_AUTO_LEAVE_GROUP = "common.auto.leave.group";
	public static final String COMMON_AUTO_JOIN_GROUP = "common.auto.join.group";
	public static final String COMMON_KEYWORD = "common.keyword";
	public static final String COMMON_MESSAGE = "common.message";
	public static final String COMMON_URL = "common.url";
	public static final String COMMON_RECIPIENT = "common.recipient";
	public static final String COMMON_SENDER = "common.sender";
	public static final String COMMON_DATE = "common.date";
	public static final String COMMON_STATUS = "common.status";
	public static final String COMMON_KEYWORD_DESCRIPTION = "common.keyword.description";
	public static final String COMMON_AT_LEAST_ONE_GROUP = "common.at.least.one.group";
	public static final String COMMON_NOTES = "common.notes";
	public static final String COMMON_CURRENT_STATUS = "common.current.status";
	public static final String COMMON_E_MAIL_ADDRESS = "common.email.address";
	public static final String COMMON_E_MAIL = "common.email";
	public static final String COMMON_OTHER_PHONE_NUMBER = "common.other.phone.number";
	public static final String COMMON_PHONE_NUMBER = "common.phone.number";
	public static final String COMMON_NAME = "common.name";
	public static final String COMMON_CONTACT_NOTES = "common.contact.notes";
	public static final String COMMON_CONTACT_E_MAIL_ADDRESS = "common.contact.email";
	public static final String COMMON_CONTACT_OTHER_PHONE_NUMBER = "common.contact.other.phone.number";
	public static final String COMMON_CONTACT_NAME = "common.contact.name";
	public static final String COMMON_MESSAGE_RECIPIENT = "common.message.recipient";
	public static final String COMMON_MESSAGE_SENDER = "common.message.sender";
	public static final String COMMON_MESSAGE_STATUS = "common.message.status";
	public static final String COMMON_MESSAGE_TYPE = "common.message.type";
	public static final String COMMON_MESSAGE_CONTENT = "common.message.content";
	public static final String COMMON_RECIPIENT_NAME = "common.message.recipient.name";
	public static final String COMMON_RECIPIENT_NUMBER = "common.message.recipient.number";
	public static final String COMMON_SENDER_NAME = "common.message.sender.name";
	public static final String COMMON_SENDER_NUMBER = "common.message.sender.number";
	public static final String COMMON_MESSAGE_DATE = "common.message.date";
	public static final String COMMON_MESSAGE_HISTORY_OF = "common.message.history.of";
	public static final String COMMON_EDITING_KEYWORD = "common.editing.keyword";
	public static final String COMMON_UNDEFINED = "common.undefined";
	public static final String COMMON_HTTP_REQUEST = "common.http.request";
	public static final String COMMON_EDITING_KEYWORD_WHITELIST = "common.editing.keyword.whitelist";
	public static final String COMMON_EDITING_KEYWORD_BLACKLIST = "common.editing.keyword.blacklist";
	public static final String COMMON_SUBJECT = "common.subject";
	public static final String COMMON_CONTENT = "common.content";
	public static final String COMMON_CONTACTS_IN_GROUP = "common.contacts.in.group";
	public static final String COMMON_KEYWORD_ACTIONS_OF = "common.keyword.actions.of";
	public static final String COMMON_EDITING_SMS_SERVICE = "common.edting.sms.service";
	public static final String COMMON_EDITING_EMAIL_ACCOUNT = "common.editing.email.account";
	public static final String COMMON_BLANK = "common.blank";
	public static final String COMMON_SUBMITTER = "common.submitter";
	public static final String COMMON_RESULT = "common.result";
	public static final String COMMON_HITS = "common.hits";
	public static final String COMMON_BUTTON = "common.button";
	public static final String COMMON_CHECKBOX = "common.checkbox";
	public static final String COMMON_CREDITCARD = "common.creditcard";
	public static final String COMMON_CURRENCY = "common.currency";
	public static final String COMMON_DROP_DOWN_LIST = "common.dropdownlist";
	public static final String COMMON_MENU_ITEM = "common.menuitem";
	public static final String COMMON_NUMBER = "common.number";
	public static final String COMMON_PASSWORD = "common.password";
	public static final String COMMON_PHONENUMBER = "common.phonenumber";
	public static final String COMMON_RADIO_BUTTON = "common.radiobutton";
	public static final String COMMON_TEXT_AREA = "common.textarea";
	public static final String COMMON_TEXT_FIELD = "common.textfield";
	public static final String COMMON_TIME = "common.time";
	public static final String COMMON_TRUNCATED_TEXT = "common.truncatedtext";
	public static final String COMMON_WRAPPED_TEXT = "common.wrappedtext";
	public static final String COMMON_PROPERTIES = "common.properties";
	public static final String COMMON_TYPE = "common.type";
	public static final String COMMON_PALETTE = "common.palette";
	public static final String COMMON_PREVIEW = "common.preview";
	public static final String COMMON_PROPERTY = "common.property";
	public static final String COMMON_VALUE = "common.value";
	public static final String COMMON_DATABASE_CONFIG = "common.database.config";
	public static final String COMMON_CONNECTION_FAILED = "common.connection.failed";
	public static final String COMMON_CONNECTION_OK = "common.connection.ok";
	public static final String COMMON_DATABASE_CONNECTION_FAILED = "common.db.connection.failed";
	public static final String COMMON_ATTENTION = "common.attention";
	
	public static final String MENUITEM_SWITCH_TO_CLASSIC_VIEW = "menuitem.classic.view";
	public static final String MENUITEM_SWITCH_TO_ADVANCED_VIEW = "menuitem.advanced.view";
	
	public static final String MESSAGE_GROUP_NO_MEMBERS = "message.no.members";
	public static final String MESSAGE_KEYWORD_EXISTS = "message.keyword.already.exists";
	public static final String MESSAGE_KEYWORD_SAVED = "message.keyword.saved";
	public static final String MESSAGE_MESSAGE_OR_CMD_BLANK = "message.message.or.cmd.blank";
	public static final String MESSAGE_KEYWORD_BLANK = "message.keyword.blank";
	public static final String MESSAGE_CONTACT_IS_ALREADY_LISTED = "message.contact.is.already.listed";
	public static final String MESSAGE_GROUP_IS_ALREADY_LISTED = "message.group.is.already.listed";
	public static final String MESSAGE_ACCOUNT_NAME_BLANK = "message.account.name.blank";
	public static final String MESSAGE_ACCOUNT_NAME_ALREADY_EXISTS = "message.account.already.exists";
	public static final String MESSAGE_FAILED_TO_CONNECT = "message.failed.to.connect";
	public static final String MESSAGE_CONTINUING_TO_SEARCH_FOR_HIGHER_SPEED = "message.continuing.to.search.for.higher.speed";
	public static final String MESSAGE_READY_TO_CONNECT = "message.ready.to.connect";
	public static final String MESSAGE_ONLY_DORMANTS = "message.only.dormants";
	public static final String MESSAGE_WRONG_FORMAT_DATE = "message.wrong.format.date";
	public static final String MESSAGE_START_DATE_AFTER_END = "message.start.date.after.end";
	public static final String MESSAGE_CLICKATELL_ACCOUNT_BLANK = "message.clickatell.account.blank";
	public static final String MESSAGE_LOG_FILES_SENT = "message.log.files.sent";
	public static final String MESSAGE_FAILED_TO_SEND_REPORT = "message.failed.to.send.report";
	public static final String MESSAGE_FAILED_TO_COPY_LOGS = "message.failed.to.copy.logs";
	public static final String MESSAGE_LOGS_LOCATED_IN = "message.logs.location";
	public static final String MESSAGE_LOGS_SAVED_PLEASE_REPORT = "message.logs.saved.please.report";
	
	public static final String SENTENCE_SELECT_MESSAGE_RECIPIENT_TITLE = "sentence.select.message.recipient";
	public static final String SENTENCE_DELETE_KEY = "sentence.delete.key";
	public static final String SENTENCE_UP_KEY = "sentence.up.key";
	public static final String SENTENCE_DOWN_KEY = "sentence.down.key";
	
	public static final String TOOLTIP_UNNAMED_GROUP = "tooltip.group.unnamed";
	public static final String TOOLTIP_UNGROUPED_GROUP = "tooltip.group.ungrouped";
	public static final String TOOLTIP_DRAG_TO_REMOVE = "tooltip.drag.to.remove";
	public static final String TOOLTIP_DRAG_TO_PREVIEW = "tooltip.drag.to.preview";
	
	/** Keys for fetching month names from the language bundle. */
	public static final String[] MONTH_KEYS = {
			"month.jan",
			"month.feb",
			"month.mar",
			"month.apr",
			"month.may",
			"month.jun",
			"month.jul",
			"month.aug",
			"month.sep",
			"month.oct",
			"month.nov",
			"month.dec"
	};
	

//> SMS DEVICE STATUS KEYS
	/** Key for text: SMS Device Status: dormant */
	public static final String SMS_DEVICE_STATUS_DORMANT = COMMON_DORMANT;
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_DEVICE_STATUS_SEARCHING = "message.searching.for.devices";
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_DEVICE_STATUS_DETECTED = "message.phone.detected";
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_DEVICE_STATUS_CONNECTED = "common.connected";
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_DEVICE_STATUS_DISCONNECT = "common.disconnect";
	/** Key for text: SMS Device Status: Disconnect forced - the device was forced to disconnect for some reason and cannot reconnect. */
	public static final String SMS_DEVICE_STATUS_DISCONNECT_FORCED = "common.disconnect.forced";
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_DEVICE_STATUS_DUPLICATE = "message.duplicate.connection";
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_DEVICE_STATUS_MAX_SPEED = "message.max.speed.found";
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_DEVICE_STATUS_TRYING_TO_CONNECT = "message.trying.to.connect";
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_DEVICE_STATUS_NO_PHONE_DETECTED = "message.no.phone.detected";
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_DEVICE_STATUS_CONNECTING = "common.connecting";
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_DEVICE_STATUS_FAILED_TO_CONNECT = "common.failed.connect";
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_DEVICE_STATUS_LOW_CREDIT = "common.low.credit";
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_DEVICE_STATUS_DISCONNECTING = "common.disconnecting";
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_DEVICE_STATUS_RECEIVING_FAILED = "common.receiving.failed";
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_DEVICE_STATUS_TRYING_RECONNECT = "common.trying.to.reconnect";
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_MODEM_STATUS_GSM_REG_FAILED = "message.gsm.registration.failed";
	/** Key for text: SMS Device Status: TODO */
	public static final String SMS_MODEM_STATUS_ALREADY_OWNED = "message.owner.is";

	/** String in messages which is substituted for a value */
	public static final String ARG_VALUE = "%";

	public static final String PROPERTY_FIELD = "field";

	public static final String MESSAGE_GROUP_MANAGER_LOADED = "message.group.manager.loaded";
	public static final String MESSAGE_SURVEY_ANALYST_LOADED = "message.survey.analyst.loaded";
	public static final String MESSAGE_REPLY_MANAGER_LOADED = "message.reply.manager.loaded";
	public static final String MESSAGE_MODEM_LIST_UPDATED = "message.modem.list.loaded";
	public static final String MESSAGE_MESSAGES_LOADED = "message.messages.loaded";
	public static final String MESSAGE_KEYWORDS_LOADED = "message.keywords.loaded";
	public static final String MESSAGE_EMAILS_LOADED = "message.emails.loaded";
	public static final String MESSAGE_SEND_CONSOLE_LOADED = "message.send.console.loaded";
	public static final String MESSAGE_SURVEY_MANAGER_LOADED = "message.survey.manager.loaded";
	public static final String MESSAGE_CONTACT_MANAGER_LOADED = "message.contact.manager.loaded";
	public static final String MESSAGE_NO_FILE_SELECTED = "message.no.file.selected";
	public static final String MESSAGE_IMPOSSIBLE_TO_GO_UP_A_DIRECTORY = "message.impossible.to.go.up";
	public static final String MESSAGE_DIRECTORY_NOT_FOUND = "message.directory.not.found";
	public static final String MESSAGE_NO_GROUP_SELECTED_TO_FWD = "message.no.group.selected";
	public static final String MESSAGE_NO_ACCOUNT_SELECTED_TO_SEND_FROM = "message.no.email.account.selected";
	public static final String MESSAGE_BLANK_RECIPIENTS = "message.recipients.blank";
	public static final String MESSAGE_NO_CONTACT_SELECTED = "message.no.contact.selected";
	public static final String MESSAGE_NO_GROUP_CREATED_BY_USERS = "message.no.group.created.by.users";
	public static final String MESSAGE_KEYWORD_ACTIONS_DELETED = "message.keyword.actions.deleted";
	public static final String MESSAGE_TASKS_DELETED = "message.tasks.deleted";
	public static final String MESSAGE_REMOVING_KEYWORD_ACTIONS = "message.removing.keyword.actions";
	public static final String MESSAGE_REMOVING_TASKS = "message.removing.tasks";
	public static final String MESSAGE_MESSAGE_RECEIVED = "message.message.received";
	public static final String MESSAGE_CONTACTS_DELETED = "message.contacts.deleted";
	public static final String MESSAGE_REMOVING_CONTACTS = "message.removing.contacts";
	public static final String MESSAGE_GROUP_ALREADY_EXISTS = "message.group.already.exists";
	public static final String MESSAGE_IMPOSSIBLE_TO_CREATE_A_GROUP_HERE = "message.impossible.to.create.group.here";
	public static final String MESSAGE_MESSAGES_DELETED = "message.messages.deleted";
	public static final String MESSAGE_EMAILS_DELETED = "message.emails.deleted";
	public static final String MESSAGE_REMOVING_MESSAGES = "message.removing.messages";
	public static final String MESSAGE_REMOVING_EMAILS = "message.removing.emails";
	public static final String MESSAGE_GROUPS_AND_CONTACTS_DELETED = "message.group.and.contacts.deleted";
	public static final String MESSAGE_REMOVING_GROUPS_AND_CONTACTS = "message.removing.groups.and.contacts";
	public static final String MESSAGE_EXISTENT_CONTACT = "message.contact.already.exists";
	public static final String MESSAGE_PHONE_BLANK = "message.phone.number.blank";
	public static final String MESSAGE_NO_GROUP_SELECTED = "message.no.group.selected.to.send";
	public static final String MESSAGE_BLANK_PHONE_NUMBER = "message.no.phone.number.to.send";
	public static final String MESSAGE_BLANK_TEXT = "message.message.blank";
	public static final String MESSAGE_PHONE_MANAGER_INITIALISED = "message.phone.manager.initialised";
	public static final String MESSAGE_INITIALISING_PHONE_MANAGER = "message.starting.phone.manager";
	public static final String MESSAGE_STARTING = "message.starting";
	
	public static final String DEFAULT_GROUPS_DELIMITER = ", ";
	public static final String PROPERTY_TYPE = "type";
	public static final String OPEN_MODE = "open";
	public static final String SAVE_MODE = "save";

	public static final String DEMO_SENDER_NAME = "<senderName>";
	public static final String DEMO_SENDER_MSISDN = "<senderPhoneNumber>";
	public static final String DEMO_MESSAGE_TEXT_INCOMING = "<incomingMessageText>";
	public static final String DEMO_MESSAGE_KEYWORD = "<incomingKeyword>";

	// TODO this may cause problems as it is never saved in a DAO... this remains to be seen...
	public static final Contact DEMO_SENDER = new Contact(DEMO_SENDER_NAME, DEMO_SENDER_MSISDN, null, null, null, true);
	
	public static final String DEFAULT_EXPORT_DATE_FORMAT = "date.export.format";
	
	public static final String DEFAULT_TIME = "00:00";

//> DATE FORMATS
	/** [i18n key to Date format] years, months and days.
	 * This should specify a 4 digit year as it will be used for parsing entered dates as well as displaying used ones. */
	public static final String DATEFORMAT_YMD = "date.keyword.action.format";
	/** [i18n key to Date format] This date format is for displaying the date and time of an event, message etc.  It is not used for parsing input. */
	public static final String DATEFORMAT_YMD_HMS = "date.message.format";
}
