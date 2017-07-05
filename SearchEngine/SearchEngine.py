
## Search Engine ###

## Finding a single links in a webpage

def get_next_target(page):
    start_link = page.find('<a href=')
    
    #print(start_link)
    if(start_link==-1):
        return None,0
    #Insert your code below here
    else:
        start_quote = page.find('"', start_link)
        end_quote = page.find('"', start_quote + 1)
        url = page[start_quote + 1:end_quote]
        return url, end_quote
        
url,end_quote=get_next_target('page <a href="http://udacity.com">link!</a>')

if url:
    print url
else:
    print "no url in webpage"
