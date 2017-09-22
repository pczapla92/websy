import { WebsyWebPage } from './app.po';

describe('websy-web App', function() {
  let page: WebsyWebPage;

  beforeEach(() => {
    page = new WebsyWebPage();
  });

  it('should display message saying app works', () => {
    page.navigateTo();
    expect(page.getParagraphText()).toEqual('app works!');
  });
});
