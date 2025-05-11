> Most users probably don't need this.
> Stick to the official modules unless you know why you want a shaded jar.

# adventure-shaded

This repo builds a **shaded "uber" JAR** that bundles
the [adventure][adventure]
and [adventure-platform][adventure-platform] libraries.

### Why?

Adventure is split across over 15 modules, which is great — but for my use cases,
this is not desirable.
This project makes it easier by bundling them into one jar.

### Current Versions

* **Adventure**: `4.17.0`
* **Adventure Platform**: `4.3.3`

[adventure]: https://github.com/KyoriPowered/adventure
[adventure-platform]: https://github.com/KyoriPowered/adventure-platform