# DatabindingLibraryProjectTest

Issues:

library layout file is not completely overriden by the app layout file:
- attributes which are using databing for its values are not overriden (e.g. see text and onClick attributes of the buttons)
- errors, if the layout file doesn't contain the exact same count and type of view element as the library files (e.g. error if additional viewsor instead of a button a textview)
