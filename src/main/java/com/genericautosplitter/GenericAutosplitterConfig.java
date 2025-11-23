package com.genericautosplitter;

import net.runelite.client.config.*;

@ConfigGroup(GenericAutosplitterPlugin.AUTOSPLITTER_PLUGIN_NAME)
public interface GenericAutosplitterConfig extends Config
{
	@ConfigItem(
			position = 0,
			keyName = "port",
			name = "Port",
			description = "Port for the LiveSplit server. (Restart required)"
	)
	default int port() {
		return 16834;
	}

    @ConfigItem(
            position = 1,
            keyName = "startHotKey",
            name = "Start Hotkey",
            description = "Hotkey for sending a start to the LiveSplit server\nIt is recommended to unset this hotkey within LiveSplit"
    )
    default Keybind startHotKey() {
        return Keybind.NOT_SET;
    }

    @ConfigItem(
            position = 2,
            keyName = "resetHotKey",
            name = "Reset Hotkey",
            description = "Hotkey for sending a reset to the LiveSplit server\nIt is recommended to unset this hotkey within LiveSplit"
    )
    default Keybind resetHotKey() {
        return Keybind.NOT_SET;
    }

	@ConfigSection(
			name = "Customization Instructions",
			description = "Instructions",
			position = 3
	)
	String instructionsSection = "instructionsSect";

	@ConfigItem(
			keyName = "instructions",
			name = "Instructions",
			description = "Instructions",
			position = 3,
			section = "instructionsSect"
	)
	default String instructions()
	{
		return "Better instructions are in the readme (right click plugin -> support)\n" +
				"Open LiveSplit. Right click it and start TCP Server. Open the RuneLite sidebar and press connect. " +
				"To add automatic splits, first make sure you have splits showing on LiveSplit. " +
				"Get the Watchdog plugin from the plugin hub. Create any trigger you want, " +
				"and give it a PluginMessage trigger with the namespace \"Autosplitter\" and name \"split\"";

	}

}
