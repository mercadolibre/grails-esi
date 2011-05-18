# Grails ESI

This is a plugin for Grails that will add some ESI tags for your GSPs.

## How do I use it?

### Include

```html
<esi:include controller="foo" action="bar" />
```

This will include the content of FooController and action bar on development and will generate an ESI tag on production, something like:

```html
<esi:include src="http://www.changeme.com/world" />
```

## What is still missing?

* Include: support for alt and onerror
* Inline
* Choose | when | otherwise
* Try | attempt | except
* Comment
* Remove
* Vars

## I want to contribute!

That is great! Just fork the project in github. Create a topic branch, write some tests and the feature that you wish to contribute.

Thanks for helping!
